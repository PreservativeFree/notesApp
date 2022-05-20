package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;

import java.util.List;
import java.util.Optional;

public interface NoteService {
    void deleteNoteById(Long id);
    void updateNotesById(NoteDto noteDto);
    void addNote(NoteDto noteDto, Long userId);
    List<NoteDto> getAllNotesById(Long userId);
    Optional<NoteDto> getNoteById(Long noteId);
}
