package com.example.demo.config;

import com.example.demo.model.Note;
import com.example.demo.repository.NoteRepository;
import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitialConfiguration {

    @Autowired
    private NoteRepository noteRepository;

    @PostConstruct
    public void init() {
        noteRepository.save(new Note("Test note 1", LocalDateTime.now()));
        noteRepository.save(new Note("Test note 2", LocalDateTime.now()));
    }
}
