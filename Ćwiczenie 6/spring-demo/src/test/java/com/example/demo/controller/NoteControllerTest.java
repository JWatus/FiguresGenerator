package com.example.demo.controller;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import com.example.demo.DemoApplication;
import com.example.demo.model.Note;
import java.time.LocalDateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class NoteControllerTest {

    @Autowired
    private NoteController noteController;

    @Test
    public void shouldCreateNewTest() {
        // given
        Note newNote = new Note("TEST 123", LocalDateTime.now());

        // when
        Note savedNote = noteController.addNote(newNote);

        // then
        assertNotNull(savedNote.getId());
        assertThat(savedNote.getId(), is(3L));
    }

}