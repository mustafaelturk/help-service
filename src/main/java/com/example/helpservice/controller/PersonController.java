package com.example.helpservice.controller;

import com.example.helpservice.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons/{name}")
    public String getPersonWithM(@PathVariable String name) {
        return personService.getPerson(name);
    }
}
