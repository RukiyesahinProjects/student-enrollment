package com.example.universitystudentenrollmentsystem.service;

import com.example.universitystudentenrollmentsystem.dao.EnrollmentRepository;
import com.example.universitystudentenrollmentsystem.model.Course;
import com.example.universitystudentenrollmentsystem.model.Enrollment;
import com.example.universitystudentenrollmentsystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository repo;
    public List<Enrollment> getAll() { return repo.findAll(); }
    public Enrollment enroll(Student s, Course c, String grade) {
        Enrollment e = new Enrollment(null, s, c, grade);
        return repo.save(e);
    }
}
