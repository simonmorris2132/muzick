package com.careerdevs.muzick.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.careerdevs.muzick.models.Listener;
import com.careerdevs.muzick.repositories.ListenerRepo;

@CrossOrigin
@RestController
@RequestMapping("/api/listeners")
public class ListenerController {
    
    @Autowired
    private ListenerRepo repo;

    @GetMapping("/test")
    public ResponseEntity<String> rootRoute() {
       return new ResponseEntity<>("Okay", HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> createListener(@RequestBody Listener newListener) {
        Listener listener = repo.save(newListener);
        
        return new ResponseEntity<>(listener, HttpStatus.CREATED);
    }

}
