package se.softhouse.notes.services;

import se.softhouse.notes.db.entity.Note;

import java.util.List;

public interface NoteService {
    List<Note> getNotes();

    void createNote(Note note);

    Note getNoteBy(int id);

    void updateNote(Note note);

    void deleteNoteBy(int id);
}
