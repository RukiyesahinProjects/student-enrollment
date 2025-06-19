package com.example.universitystudentenrollmentsystem.controller;

import com.example.universitystudentenrollmentsystem.model.Course;
import com.example.universitystudentenrollmentsystem.model.Student;
import com.example.universitystudentenrollmentsystem.service.CourseService;
import com.example.universitystudentenrollmentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return students;
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PostMapping("/{studentId}/enroll/{courseId}")
    public ResponseEntity<?> enrollStudent(@PathVariable Long studentId, @PathVariable Long courseId) {
        Student student = studentService.getStudentById(studentId).orElseThrow();
        Course course = courseService.getCourseById(courseId).orElseThrow();
        studentService.addStudent(student); // Save updated student
        return ResponseEntity.ok("Student enrolled successfully");
    }
}