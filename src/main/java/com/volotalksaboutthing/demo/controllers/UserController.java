package com.volotalksaboutthing.demo.controllers;

import java.util.List;
import com.volotalksaboutthing.demo.dataObject.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UsersRepo repo;

    @GetMapping(value = "/items")
    public ResponseEntity<List<User>> getAllItems() {
        try {
            // TODO Exception hdndling management
            return new ResponseEntity<>(repo.getItems(), HttpStatus.OK);    

        } catch (Exception e) {
            
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }   
    }
    
}