package com.example.demo.Dto;


public class CourseDto {

    public CourseDto(String courses,int semester){
        this.courses = courses;
        this.semester = semester;
    }
    private String courses;
    private int semester;

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
  // value line
    public int getSemester() {
        return semester;
    }


    //value assign garne
    public void setSemester(int semester) {
        this.semester = semester;
    }
}
