package se.softhouse.metrics.exceptions;

import javax.ws.rs.WebApplicationException;

/**
 * @todo: this class should be renamed to 'MyProjectException' for your projects
 */
public class MetricException extends WebApplicationException {
    public MetricException(int status) {
        super(status);
    }

    public MetricException(String message, int status) {
        super(message, status);
    }

    public MetricException(String message, Throwable cause) {
        super(message, cause);
    }
}
