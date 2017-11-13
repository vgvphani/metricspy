package se.softhouse.notes.exceptions;

import javax.ws.rs.WebApplicationException;

/**
 * @todo: this class should be renamed to 'MyProjectException' for your projects
 */
public class NoteException extends WebApplicationException {
    public NoteException(int status) {
        super(status);
    }

    public NoteException(String message, int status) {
        super(message, status);
    }

    public NoteException(String message, Throwable cause) {
        super(message, cause);
    }
}
