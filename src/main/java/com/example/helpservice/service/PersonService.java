package com.example.helpservice.service;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public String getPerson(String name) {

        if (name.startsWith("m")) {

            return "OK";
        }

        return "NO";
    }
}
