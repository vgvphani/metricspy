package se.softhouse.metrics.exceptions;

import java.util.function.Supplier;

/**
 * @todo: this class should be renamed to 'MyProjectExceptions' for your projects
 */
public enum MetricExceptions implements Supplier<RuntimeException> {
    BAD_REQUEST(with(400, "Bad request to resource")), //
    NOT_AUTHORIZED(with(401, "Unauthorized")), //
    FORBIDDEN(with(403, "Unauthorized")), //
    NOT_FOUND(with(404, "Resource not found")), //
    FATAL(new RuntimeException()), //
    NOT_IMPLEMENTED(with(501, "Not implemented yet"));

    private RuntimeException runtimeException;

    MetricExceptions(RuntimeException exception) {
        this.runtimeException = exception;
    }

    private static MetricException with(Integer statusCode) {
        return new MetricException(statusCode);
    }

    private static MetricException with(Integer statusCode, String message) {
        return new MetricException(message, statusCode);
    }

    public void raise() {
        throw runtimeException;
    }

    public void raise(String errorMessageFormat, Object... objects) {
        throw new MetricException(String.format(errorMessageFormat, objects), runtimeException);
    }

    @Override
    public RuntimeException get() {
        return runtimeException;
    }
}
