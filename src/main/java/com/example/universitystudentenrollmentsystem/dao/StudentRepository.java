package com.example.universitystudentenrollmentsystem.dao;

import com.example.universitystudentenrollmentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
