package com.example.demo.controller;


import com.example.demo.Dto.Signupdto;
import com.example.demo.servicce.Signupservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin("*")
public class Firstcontroller {

    private final Signupservice signs;
    Firstcontroller( Signupservice signs){
        this.signs = signs;


    }
    @GetMapping("/hello")
    public String hello() {
        return "Spring boot project running sucessfully";
    }


    @GetMapping
    public String wellcome() {
        return "hi";
    }

    @PostMapping("/signup")
    public String createStudent(@RequestBody Signupdto dtos) {

        return signs.createAccount(dtos);
    }
}

//    @PostMapping("/login")
//    public String  studentLogin(@RequestBody){
//        return loginService.loginInfo(dto);
//    }
//}
