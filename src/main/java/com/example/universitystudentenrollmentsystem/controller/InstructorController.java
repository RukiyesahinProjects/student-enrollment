package com.example.universitystudentenrollmentsystem.controller;

import com.example.universitystudentenrollmentsystem.model.Instructor;
import com.example.universitystudentenrollmentsystem.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructors")
public class InstructorController {
    @Autowired
    private InstructorService service;

    @GetMapping
    public List<Instructor> getAll() { return service.getAll(); }
    @PostMapping
    public Instructor save(@RequestBody Instructor i) { return service.save(i); }
}
