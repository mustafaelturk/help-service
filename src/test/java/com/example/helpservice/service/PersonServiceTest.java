package com.example.helpservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    private PersonService personService;

    @BeforeEach
    void setUp() {
        // Instantiate the service
        personService = new PersonService();
    }


    @Test
    void shouldGetNameWithM() {

        String name = "mustafa";
        String personOK = personService.getPerson(name);
        assertThat(personOK).isEqualTo("OK");

    }

    @Test
    void shouldGetNameWithoutM() {

        String name = "Fabio";
        String personOK = personService.getPerson(name);
        assertThat(personOK).isEqualTo("NO");

    }

}
