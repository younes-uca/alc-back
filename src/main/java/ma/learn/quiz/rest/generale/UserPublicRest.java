package ma.learn.quiz.rest.generale;

import ma.learn.quiz.bean.User;
import ma.learn.quiz.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learn/authentification")
public class UserPublicRest {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<?> signIn(@RequestBody User user) {
        System.out.println("try to connect again");
        return userService.signIn(user);
    }
}
