package com.hibernate_jpa.hibernate_jpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate_jpa.hibernate_jpa.entities.Person;
import com.hibernate_jpa.hibernate_jpa.repositories.Repo_Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private Repo_Person repoPerson;

    @GetMapping
    public List<Person> getAllPersons() {
        return (List<Person>) repoPerson.findAll();
    }
}
