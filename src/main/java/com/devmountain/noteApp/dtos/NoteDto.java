package com.devmountain.noteApp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import com.devmountain.noteApp.entities.Note;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class NoteDto implements Serializable {

    private long id;
    private String body;
    private UserDto userDto;

    public NoteDto(Note note) {

        if(note.getBody() != null) {
            this.body = note.getBody();
        }
    }
}
