package se.softhouse.notes.services.impl;

import se.softhouse.notes.db.NoteDAO;
import se.softhouse.notes.db.entity.Note;
import se.softhouse.notes.exceptions.NoteExceptions;
import se.softhouse.notes.services.NoteService;

import java.util.List;

public class NoteServiceDbImpl implements NoteService {
    private final NoteDAO noteDAO;

    public NoteServiceDbImpl(NoteDAO noteDAO) {
        this.noteDAO = noteDAO;
    }

    @Override
    public List<Note> getNotes() {
        return noteDAO.selectAll();
    }

    @Override
    public void createNote(Note note) {
        noteDAO.insert(note);
    }

    @Override
    public Note getNoteBy(int id) {
        return noteDAO.get(id).orElseThrow(NoteExceptions.NOT_FOUND);
    }

    @Override
    public void updateNote(Note note) {
        noteDAO.update(note);
    }

    @Override
    public void deleteNoteBy(int id) {
        noteDAO.delete(id);
    }
}
