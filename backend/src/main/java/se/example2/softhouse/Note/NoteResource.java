package se.example2.softhouse.Note;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hxs on 2016-08-16.
 */

@Path("/note")
public class NoteResource {

    private List<Note> notes;

    public NoteResource(Note defaultNote) {
        notes = new ArrayList<>();
        notes.add(defaultNote);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Note> getNotes() {
        return notes;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addNote(Note newNote) {
        notes.add(newNote);
    }
}
