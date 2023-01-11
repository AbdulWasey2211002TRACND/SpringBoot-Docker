package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Course.Course;
import com.example.demo.Course.CourseService;
import com.example.demo.Course.CourseServiceImpl;

@RestController
public class CourseController {

    @Autowired
    private CourseService course;

    @GetMapping("/get_courses")
    public List<Course> getcourses() {

        return this.course.get_courses();
    }

    @GetMapping("/get_course")
    public List<Course> getcourse(@RequestParam int id) {

        return this.course.get_course(id);
    }

    @PostMapping("/add_course")
    public String addcourses(@RequestBody Course courseobj) {

        return course.add_course(courseobj);
    }

    @GetMapping("/get_course_by_id")
    public List<Course> getcourseid(@RequestParam int id) {

        return course.get_course(id);
    }

    @DeleteMapping("/delete_course")
    public String deletecourses(@RequestParam int id) {

        return this.course.delete_course(id);
    }

}
