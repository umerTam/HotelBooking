package org.github.controller;

import org.github.entity.User;
import org.github.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    private final UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String getLoginPage() {
        return "login-page";
    }

    @RequestMapping("/register")
    public String getRegistrationPage() {
        return "register-page";
    }

    @RequestMapping(value = "/register-user", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute User user) {
        if(user != null && !userService.isEmailTaken(user.getEmail())) {
            userService.createUser(user);
            return "redirect:/login";
        }
        return "register-page";
    }

    @RequestMapping(value = "/login-user", method = RequestMethod.POST)
    public String loginUser(@RequestParam String email, @RequestParam String password) {
        User user = userService.findUserByEmail(email);
        if(user != null) {
            if(user.getPassword().equals(password)) {
                return "main-page";
            }
        }
        return getLoginPage();
    }
}
