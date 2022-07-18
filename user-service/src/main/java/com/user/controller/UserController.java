package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {

        User user = this.userService.getUser(userId);
        System.out.println("GETUSER "+userId);
        //http://localhost:8082/contact/user/1311
        System.out.println("used id is"+user.getUserId());
        List contacts = this.restTemplate.getForObject("http://contact_services:8082/contact/user/" + user.getUserId(), List.class);

        System.out.println(contacts);
        user.setContacts(contacts);
        return user;

    }

}
