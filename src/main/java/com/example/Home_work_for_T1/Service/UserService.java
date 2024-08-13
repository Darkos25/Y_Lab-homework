package com.example.Home_work_for_T1.Service;

import com.example.Home_work_for_T1.Model.User;
import com.example.Home_work_for_T1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return this.userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public void update(User user) {
        userRepository.save(user);
    }
}
