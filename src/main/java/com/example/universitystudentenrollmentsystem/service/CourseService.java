package com.example.universitystudentenrollmentsystem.service;


import com.example.universitystudentenrollmentsystem.dao.CourseRepository;
import com.example.universitystudentenrollmentsystem.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}