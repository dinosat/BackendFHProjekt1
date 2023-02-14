package com.example.backendfhprojekt.service;
import com.example.backendfhprojekt.model.MyUser;
import com.example.backendfhprojekt.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<MyUser> GetAllUsers() {
        return userRepository.findAll();
    }

    public Optional<MyUser> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public MyUser createUser(MyUser user) {
        return userRepository.save(user);
    }

    public MyUser updateUser(Long userId, MyUser userDetails) {
        MyUser user = userRepository.findById(userId).orElseThrow();
        user.setUserFirstName(userDetails.getUserFirstName());
        user.setUserLastName(userDetails.getUserLastName());
        user.setUserEmail(userDetails.getUserEmail());
        user.setUserPassword(userDetails.getUserPassword());
        user.setUserName(userDetails.getUserName());
        user.setUserRole(userDetails.getUserRole());
        return userRepository.save(user);
    }


    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }


}
