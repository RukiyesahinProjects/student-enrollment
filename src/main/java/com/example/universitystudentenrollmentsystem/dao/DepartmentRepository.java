package com.example.universitystudentenrollmentsystem.dao;

import com.example.universitystudentenrollmentsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
