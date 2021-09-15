package ma.learn.quiz.service.facade;

import ma.learn.quiz.bean.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    ResponseEntity<?> signIn(User user);

    User save(User user);
   List<User> findAll();
}
