package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Secondcontroller {
    @GetMapping("/kris")
            public String Second()
    {
        return "HEllo kris";
    }
@PostMapping("/chy")
public int sec(@RequestParam int age){
        return age;

}

 @GetMapping("/helloweor")
    public String name(){
        return "hello";
 }


 @GetMapping("/kc")
 public String Place(){
        return "Place is Tikapur " ;
    }

}
