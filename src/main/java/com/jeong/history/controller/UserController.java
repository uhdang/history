package com.jeong.history.controller;

import com.jeong.history.api.User;
import com.jeong.history.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // Indicating this class is a controller
@CrossOrigin(origins = "http://localhost:3006") // enable CORS
@RequestMapping(path="/user") // URL's start with /user (after Application path)
public class UserController {
    @Autowired
    // This means to get the bean called userRepository auto-generated by Spring which will be used for handling data

    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addNewUser (@RequestBody User user) {
        userRepository.save(user);
        return "New user saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

//    @GetMapping(path="/add") // Map ONLY GET Requests
//    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {
//        // @ResponseBody means the returned String is the response, not a view name
//        // @RequestParam means it is a parameter from the GET or POST request
//
//        User n = new User();
//        n.setName(name);
//        n.setEmail(email);
//        userRepository.save(n);
//        return "Saved";
//    }
}


