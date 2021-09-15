package ma.learn.quiz.service.impl;

import ma.learn.quiz.bean.User;
import ma.learn.quiz.dao.UserDao;
import ma.learn.quiz.service.facade.RoleService;
import ma.learn.quiz.service.facade.UserService;
import ma.learn.quiz.service.util.JwtResponse;
import ma.learn.quiz.service.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserDao userDao;
    @Autowired private RoleService roleService;
    @Autowired private PasswordEncoder passwordEncoder;
    @Autowired private AuthenticationManager authenticationManager;
    @Autowired private JwtUtil jwtUtil;

    @Override
    public ResponseEntity<?> signIn(User user) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    user.getUsername(), user.getPassword()
            ));
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("bad creditiel for username " + user.getUsername());
        }
        User loadUserByUsername = (User)loadUserByUsername(user.getUsername());
        String token = jwtUtil.generateToken(loadUserByUsername);
        loadUserByUsername.setPassword(null);
        return ResponseEntity.ok(new JwtResponse(loadUserByUsername,token));
    }

    @Override
    public User save(User user) {
        User loadedUser = userDao.findByUsername(user.getUsername());
        if (loadedUser != null)
            return null;
        else {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            roleService.save(user.getAuthorities());
            userDao.save(user);
            return user;
        }
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if (user == null || user.getId() == null) {
            throw new UsernameNotFoundException("user " + username + " not founded");
        } else {
            return user;
        }
    }
}
