package com.meencodewriter.toy.stick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StickController {

    @GetMapping("/test")
    @ResponseBody
    public void interFaceTest() {
        UserRepository ur = new UserRepository();
        User user = new User(ur);
        user.save();
    }
        public class User {
        private String userName;
        private int id;
        private UserRepository userRepository;

        public User(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public void save() {
            userRepository.saveUser(this);
        }
    }
    public class UserRepository {
        public void saveUser(User user) {
            System.out.println("Save User Now...");
        }
    }
}
