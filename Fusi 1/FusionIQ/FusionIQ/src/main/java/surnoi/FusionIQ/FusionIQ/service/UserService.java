package surnoi.FusionIQ.FusionIQ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import surnoi.FusionIQ.FusionIQ.data.User;
import surnoi.FusionIQ.FusionIQ.repo.UserRepo;

import java.util.List;
@Service
public class UserService {
    private final UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public User save(User user) {
        return userRepo.save(user);
    }
    public User getHrById(Long id) {
        return userRepo.findById(id).orElse(null);
    }
    public User saveHr(User user) {
        return userRepo.save(user);
    }
    public void deleteHr(Long id) {
        userRepo.deleteHrById(id);
    }
    public List<User> getAllHrs() {
        return userRepo.findAll();
    }
    public boolean validateLogin(String email, String password) {
        User user = userRepo.findByMailAndPassword(email, password);
        return user != null;
    }
//public boolean validateLogin(String email, String password, boolean isAdmin) {
//    if (isAdmin) {
//        return userRepo.findByMailAndPasswordAndIsAdmin(email, password, true) != null;
//    } else {
//        return userRepo.findByMailAndPassword(email, password) != null;
//    }
//}

    public User registerUser(User registrationData) {
        User savedUser = userRepo.save(registrationData);
        return savedUser;
    }
    public User getByMail(String mail)  {
        return userRepo.findByMail(mail);
    }
    public boolean existsByMail(String email) {
        return userRepo.existsByMail(email);
    }
}
