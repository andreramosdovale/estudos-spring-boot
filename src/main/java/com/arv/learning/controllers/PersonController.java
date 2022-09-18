package com.arv.learning.controllers;

import com.arv.learning.models.Person;
import com.arv.learning.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/")
    public List<Person> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable(value = "id") String id) {
        return service.findById(id);
    }

    @PostMapping("/")
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping("/")
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") String id) {
        service.delete(id);
    }
}
