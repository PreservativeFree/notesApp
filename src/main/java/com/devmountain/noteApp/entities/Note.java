package com.devmountain.noteApp.entities;

import javax.persistence.*;

import com.devmountain.noteApp.dtos.NoteDto;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Notes")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "text")
    private String body;

    @ManyToOne
    @JsonBackReference
    private User user; //getLong getString

    public Note(long id, String body) {
        this.id = id;
        this.body = body;
    }
    public Note(NoteDto noteDto) {
        if(noteDto.getBody() != null) {
            this.body = noteDto.getBody();
        }
    }
}
