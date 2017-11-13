package se.softhouse.notes.resources;

import se.softhouse.notes.db.entity.Note;
import se.softhouse.notes.services.NoteService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/note")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NoteResource {
    private final NoteService noteService;

    public NoteResource(NoteService noteService) {
        this.noteService = noteService;
    }

    @GET
    public List<Note> getNotes() {
        return noteService.getNotes();
    }

    @GET
    @Path("/{id}")
    public Note getNote(@PathParam("id") int id) {
        return noteService.getNoteBy(id);
    }

    @PUT
    @Path("/{id}")
    public void updateNote(@PathParam("id") int id, @Valid @NotNull Note note) {
        note.setId(id);
        noteService.updateNote(note);
    }

    @POST
    public void createNote(@Valid @NotNull Note note) {
        noteService.createNote(note);
    }

    @DELETE
    @Path("/{id}")
    public void deleteNote(@PathParam("id") int id) {
        noteService.deleteNoteBy(id);
    }
}
