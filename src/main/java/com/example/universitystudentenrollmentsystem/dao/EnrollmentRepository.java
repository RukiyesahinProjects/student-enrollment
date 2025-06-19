package com.example.universitystudentenrollmentsystem.dao;

import com.example.universitystudentenrollmentsystem.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
