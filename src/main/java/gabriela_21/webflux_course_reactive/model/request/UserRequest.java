package gabriela_21.webflux_course_reactive.model.request;

public record UserRequest(
        String name,
        String email,
        String password
) {
}
