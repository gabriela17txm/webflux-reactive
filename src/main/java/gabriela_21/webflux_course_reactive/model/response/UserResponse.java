package gabriela_21.webflux_course_reactive.model.response;

public record UserResponse(
        String id,
        String name,
        String email,
        String password
) {
}
