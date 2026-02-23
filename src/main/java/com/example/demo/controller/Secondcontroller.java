package com.example.demo.controller;


import com.example.demo.dto.CourseDto;
import com.example.demo.service.CourseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Secondcontroller {


    private final CourseService courseService;

    public Secondcontroller(CourseService courseService) {
        this.courseService = courseService;
    }

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

    @PostMapping("/sp")
    public String course(@RequestBody CourseDto dto){
        return courseService.createCourse(dto);
    }

}
