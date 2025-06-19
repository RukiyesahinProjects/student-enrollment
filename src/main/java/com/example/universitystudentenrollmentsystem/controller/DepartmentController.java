package com.example.universitystudentenrollmentsystem.controller;

import com.example.universitystudentenrollmentsystem.model.Department;
import com.example.universitystudentenrollmentsystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    @GetMapping
    public List<Department> getAll() { return service.getAll(); }
    @PostMapping
    public Department save(@RequestBody Department d) { return service.save(d); }
}
