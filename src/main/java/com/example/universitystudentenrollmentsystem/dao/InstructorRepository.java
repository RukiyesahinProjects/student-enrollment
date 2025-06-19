package com.example.universitystudentenrollmentsystem.dao;

import com.example.universitystudentenrollmentsystem.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
