package com.arv.learning.controllers;

import com.arv.learning.models.Person;
import com.arv.learning.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonCotroller {

    @Autowired
    private PersonService service;

    @GetMapping("/{id}")
    public Person findById(@PathVariable(value = "id") String id) {
        return service.findById(id);
    }
}
