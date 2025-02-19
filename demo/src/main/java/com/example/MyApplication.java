package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}

@Controller
class MyController {

    

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/user-login")
    public String userLogin() {
        return "user-login";
    }

    @PostMapping("/login")

    public ModelAndView login(@RequestParam String username, @RequestParam String password) {

        ModelAndView modelAndView = new ModelAndView();
        if ("user123".equals(username) && "password123".equals(password)) {
            modelAndView.setViewName("success");
            modelAndView.addObject("message", "Login successful!");
        } else {
            modelAndView.setViewName("user-login");
            modelAndView.addObject("message", "Invalid credentials. Please try again.");
        }
        return modelAndView;
    }
}