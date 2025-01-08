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















// package com.example;

// import java.util.HashMap;

// class Data {
//     int id;
//     String user;

//     public Data(int id, String user) {
//         this.id = id;
//         this.user = user;
//     }

//     @Override
//     public String toString() {
//         return "Data{Id=" + id + ", user=" + user + "}";
//     }
// }

// public class App {
//     HashMap<Integer, Data> mymap = new HashMap<>(); 

//     public static void main(String[] args) {
//         App app = new App();
//         app.run();
//     }

//     public void run() {
//         // Create some Data objects
//         Data d1 = new Data(1, "name1");
//         Data d2 = new Data(2, "name2");


//         // Store Data objects into HashMap
//         mymap.put(d1.id, d1);
//         mymap.put(d2.id, d2);

//         // Print the contents of the HashMap
//         for (Integer key : mymap.keySet()) {
//             System.out.println("Key: " + key + ", Value: " + mymap.get(key));
//         }
//     }
// }
