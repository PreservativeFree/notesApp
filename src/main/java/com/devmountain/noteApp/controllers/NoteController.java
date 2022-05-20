package com.devmountain.noteApp.controllers;

import com.devmountain.noteApp.dtos.NoteDto;
import com.devmountain.noteApp.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/notes/")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/users/{userId}")
    public List<NoteDto> getNotesByUser(@PathVariable Long userId) {
        return noteService.getAllNotesById(userId);
    }

    @GetMapping("/{noteId}")
    public Optional<NoteDto> getNoteById(@PathVariable Long noteId) {
        return noteService.getNoteById(noteId);
    }

    @PostMapping("/users/{userId}") //add new note by user id
    public void addNote(@RequestBody NoteDto noteDto, @PathVariable Long userId) {
        noteService.addNote(noteDto, userId);
    }
    @DeleteMapping("/{noteId}")
    public void deleteNote(@PathVariable Long noteId) {
        noteService.deleteNoteById(noteId);
    }
    @PutMapping
    public void updateNote(@RequestBody NoteDto noteDto) {
        noteService.updateNotesById(noteDto);
    }
}
