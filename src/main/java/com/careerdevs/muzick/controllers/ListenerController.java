package com.careerdevs.muzick.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.protocol.x.Ok;

@CrossOrigin
@RestController
@RequestMapping("/api/listeners")
public class ListenerController {
    
    @GetMapping("/test")
    public ResponseEntity<String> rootRoute() {
       return new ResponseEntity<>("Okay", HttpStatus.OK);
    }

}
