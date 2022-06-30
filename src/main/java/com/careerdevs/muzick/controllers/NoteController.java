package com.careerdevs.muzick.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.careerdevs.muzick.models.Listener;
import com.careerdevs.muzick.models.Note;
import com.careerdevs.muzick.repositories.ListenerRepo;
import com.careerdevs.muzick.repositories.NoteRepo;

@CrossOrigin
@RestController
@RequestMapping("/api/notes")
public class NoteController {
    
    @Autowired
    private NoteRepo noteRepo;

    @Autowired
    private ListenerRepo listenerRepo;

    @GetMapping("/test")
    public ResponseEntity<?> testRoute() {
        return new ResponseEntity<>("note route", HttpStatus.OK);
    }

    @PostMapping("/{listenerId}")
    public ResponseEntity<?> createNote(@PathVariable Long listenerId, @RequestBody Note newNote) {
        Listener listener = listenerRepo.findById(listenerId).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );

        newNote.setListener(listener);

        Note note = noteRepo.save(newNote);
        return new ResponseEntity<>(note, HttpStatus.CREATED);

    }

    

}
