package com.arv.learning.services;

import com.arv.learning.models.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id) {
        logger.info("finding a person by id [" + id + "].");

        return new Person(counter.incrementAndGet(), "André", "Ramos", "Brazil", "Male");
    }
}
