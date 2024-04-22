package surnoi.FusionIQ.FusionIQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import surnoi.FusionIQ.FusionIQ.data.User;
import surnoi.FusionIQ.FusionIQ.data.LoginRequest;
import surnoi.FusionIQ.FusionIQ.service.EmailSenderService;
import surnoi.FusionIQ.FusionIQ.service.UserService;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @Autowired
    private EmailSenderService emailSenderService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllHrs() {
        List<User> users = userService.getAllHrs();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getHrById(@PathVariable Long id) {
        User user = userService.getHrById(id);
        return user != null ? new ResponseEntity<>(user, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    @PostMapping("/reg")
//    public ResponseEntity<?> register(@RequestBody User registrationData) {
//        if (userService.existsByMail(registrationData.getMail())) {
//            return new ResponseEntity<>("Email is already taken. Please use another email.", HttpStatus.CONFLICT);
//        }
//        User registeredUser = userService.registerUser(registrationData);
//        if (registeredUser != null) {
//            sendRegistrationSuccessEmail(registeredUser.getMail(), registeredUser.getFirstName());
//            return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
//        } else {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    //    @PostMapping("/login")
//    public ResponseEntity<User> login(@RequestBody LoginRequest loginRequest) {
//        boolean isValid = userService.validateLogin(loginRequest.getMail(), loginRequest.getPassword());
//        if (isValid) {
//            User user = userService.getByMail(loginRequest.getMail());
//            if (user != null) {
//                sendLoginSuccessEmail(user.getMail(), user.getFirstName());
//                return new ResponseEntity<>(user, HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            }
//        } else {
//            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        }
//    }
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody LoginRequest loginRequest) {
        boolean isValid = userService.validateLogin(loginRequest.getMail(), loginRequest.getPassword());
        if (isValid) {
            User user = userService.getByMail(loginRequest.getMail());
            if (user != null) {
                return new ResponseEntity<>(user, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User registrationData) {
        if (userService.existsByMail(registrationData.getMail())) {
            return new ResponseEntity<>("Email is already taken. Please use another email.", HttpStatus.CONFLICT);
        }
        User registeredUser = userService.registerUser(registrationData);
        if (registeredUser != null) {
            sendRegistrationSuccessEmail(registeredUser.getMail(), registeredUser.getFirstName());
            return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private void sendRegistrationSuccessEmail(String to, String firstName) {
        String subject = "Registration Successful";
        String body = "Dear " + firstName + ",\n\n" +
                "Thank you for registering with our system. Your account has been successfully created." + "\n\n" +
                "We appreciate your trust in us and look forward to serving you. If you have any questions or need assistance, please feel free to reach out to us. We will get back to you as soon as possible.\n\n" +
                "Best regards,\n" +
                "SURNOI TECHNOLOGY PRIVATE LIMITED";

        emailSenderService.sendEmail(to, subject, body);
    }
}
//    @PostMapping("/reg")
//    public ResponseEntity<?> register(@RequestBody Hr registrationData) {
//        if (hrService.existsByMail(registrationData.getMail())) {
//            return new ResponseEntity<>("Email is already taken. Please use another email.", HttpStatus.CONFLICT);
//        }
//        Hr registeredHr = hrService.registerHr(registrationData);
//        if (registeredHr != null) {
//            return new ResponseEntity<>(registeredHr, HttpStatus.CREATED);
//        } else {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<Hr> login(@RequestBody LoginRequest loginRequest) {
//        boolean isValid = hrService.validateLogin(loginRequest.getMail(), loginRequest.getPassword());
//        if (isValid) {
//            Hr hr = hrService.getHrByMail(loginRequest.getMail());
//            if (hr != null) {
//                return new ResponseEntity<>(hr, HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            }
//        } else {
//            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        }
//    }
//}
