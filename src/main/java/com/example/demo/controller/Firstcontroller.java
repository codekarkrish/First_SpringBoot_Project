package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin("*")
public class Firstcontroller {

    @GetMapping("/hello")
    public String hello(){
        return "Spring boot project running sucessfully";
    }


    @GetMapping
    public String wellcome(){
        return "hi";
    }

    @PostMapping("/signup")
    public String createStudent(@RequestParam String name,
                                @RequestParam String email,
                                @RequestParam String password ){

        return "Student Signup sucessfully : "+
                "name" +": "+ name+"email "+": "+email + "password "+": "+password;
    }
}
