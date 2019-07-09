package com.example.springannotations.controller;

import com.example.springannotations.annotation.TokenValidator;
import com.example.springannotations.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @TokenValidator
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getPersons(@RequestHeader String token) {

        return ResponseEntity.ok(personService.findPerson());
    }

}
