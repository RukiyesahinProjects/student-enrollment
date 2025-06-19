package com.example.universitystudentenrollmentsystem.service;

import com.example.universitystudentenrollmentsystem.dao.DepartmentRepository;
import com.example.universitystudentenrollmentsystem.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    public List<Department> getAll() { return repo.findAll(); }
    public Optional<Department> get(Long id) { return repo.findById(id); }
    public Department save(Department d) { return repo.save(d); }
    public void delete(Long id) { repo.deleteById(id); }
}

