package com.example.universitystudentenrollmentsystem.controller;

import com.example.universitystudentenrollmentsystem.model.Course;
import com.example.universitystudentenrollmentsystem.model.Enrollment;
import com.example.universitystudentenrollmentsystem.model.Student;
import com.example.universitystudentenrollmentsystem.service.CourseService;
import com.example.universitystudentenrollmentsystem.service.EnrollmentService;
import com.example.universitystudentenrollmentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;
    @PostMapping("/student/{studentId}/course/{courseId}")
    public ResponseEntity<Enrollment> enroll(@PathVariable Long studentId, @PathVariable Long courseId, @RequestParam String grade) {
        Student s = studentService.getStudentById(studentId).orElseThrow();
        Course c = courseService.getCourseById(courseId).orElseThrow();
        Enrollment e = enrollmentService.enroll(s, c, grade);
        return ResponseEntity.ok(e);
    }
    @GetMapping
    public List<Enrollment> getAll() { return enrollmentService.getAll(); }
}

