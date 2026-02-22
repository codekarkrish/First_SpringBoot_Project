package com.example.demo.servicce;

import com.example.demo.Dto.CourseDto;

import org.springframework.stereotype.Service;

@Service
public class CourseService {


    public String createCourse(CourseDto dto){
       //this is for input field validation
        if(dto.getCourses() == null ){
            return " cannot be empty";
        }
        if(dto.getSemester() == 0){
            return "semester cannot be null";
        }

//       return new CourseDto(
//                 dto.getCourses(),
//                 dto.getSemester()
//         );

//   CourseDto data = new CourseDto(
//           dto.setCourses();
//   )
        return "data get sucessedfully" +  dto.getCourses()+dto.getSemester();

     }


}
