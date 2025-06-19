package com.example.universitystudentenrollmentsystem.service;
import com.example.universitystudentenrollmentsystem.dao.InstructorRepository;
import com.example.universitystudentenrollmentsystem.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class InstructorService {
    @Autowired
    private InstructorRepository repo;

    public List<Instructor> getAll() {
        return repo.findAll(); }
    public Optional<Instructor> get(Long id) {
        return repo.findById(id); }
    public Instructor save(Instructor i) {
        return repo.save(i); }
    public void delete(Long id) {
        repo.deleteById(id); }
}