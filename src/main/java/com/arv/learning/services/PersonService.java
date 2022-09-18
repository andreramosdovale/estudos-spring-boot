package com.arv.learning.services;

import com.arv.learning.models.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<Person> findAll() {
        logger.info("finding all persons.");
        List<Person> personMockList = new ArrayList<>();

        Person p1 = new Person(counter.incrementAndGet(), "André 1", "Ramos", "Brazil", "Male");
        Person p2 = new Person(counter.incrementAndGet(), "André 2", "Ramos", "Brazil", "Male");
        Person p3 = new Person(counter.incrementAndGet(), "André 3", "Ramos", "Brazil", "Male");

        personMockList.add(p1);
        personMockList.add(p2);
        personMockList.add(p3);

        return personMockList;
    }

    public Person findById(String id) {
        logger.info("finding a person by id [" + id + "].");

        return new Person(counter.incrementAndGet(), "André 1", "Ramos", "Brazil", "Male");
    }

    public Person create(Person person) {
        logger.info("Register a person.");
        return person;
    }

    public Person update(Person person) {
        logger.info("Update a person.");
        return person;
    }

    public void delete(String id) {
        logger.info("Delete a person.");
    }
}
