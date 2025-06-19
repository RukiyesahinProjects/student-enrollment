package com.example.universitystudentenrollmentsystem.controller;

import com.example.universitystudentenrollmentsystem.model.Course;
import com.example.universitystudentenrollmentsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
   @Autowired
    private  CourseService courseService;
    @GetMapping
    public List<Course> getAll() {
        return courseService.getAllCourses();
    }
    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
}
