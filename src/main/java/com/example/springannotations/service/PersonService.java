package com.example.springannotations.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {

    RestTemplate restTemplate;

    ObjectMapper objectMapper;

    public String findPerson() {

        return "ola ola ola";
    }


}
