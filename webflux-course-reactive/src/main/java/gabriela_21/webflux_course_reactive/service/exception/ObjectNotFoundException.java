package gabriela_21.webflux_course_reactive.service.exception;

public class ObjectNotFoundException  extends RuntimeException {
    public ObjectNotFoundException(String message) {
        super(message);
    }
}
