package se.softhouse.notes.services.impl;

import com.google.common.collect.Lists;
import se.softhouse.notes.db.entity.Note;
import se.softhouse.notes.exceptions.NoteExceptions;
import se.softhouse.notes.services.NoteService;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * This is an example of polymorphism works and how the NoteService can be implemented
 * using an entirely different create-read-update-destroy (CRUD) mechanism.
 */
public class NoteServiceMemoryImpl implements NoteService {
    private List<Note> notes = Lists.newArrayList();
    private AtomicInteger id = new AtomicInteger();

    @Override
    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public void createNote(Note note) {
        note.setId(id.incrementAndGet());
        notes.add(note);
    }

    @Override
    public Note getNoteBy(int id) {
        return notes.stream() //
                .filter(note -> note.getId() == id) //
                .findFirst() //
                .orElseThrow(NoteExceptions.NOT_FOUND);
    }

    @Override
    public void updateNote(Note note) {
        Note noteToUpdate = getNoteBy(note.getId());

        noteToUpdate.setTitle(note.getTitle());
        noteToUpdate.setText(note.getText());
    }

    @Override
    public void deleteNoteBy(int id) {
        this.notes = notes.stream() //
                .filter(note -> note.getId() != id) //
                .collect(Collectors.toList());
    }
}
