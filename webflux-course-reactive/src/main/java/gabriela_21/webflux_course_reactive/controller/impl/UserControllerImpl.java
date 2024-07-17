package gabriela_21.webflux_course_reactive.controller.impl;

import gabriela_21.webflux_course_reactive.controller.UserController;
import gabriela_21.webflux_course_reactive.mapper.UserMapper;
import gabriela_21.webflux_course_reactive.model.request.UserRequest;
import gabriela_21.webflux_course_reactive.model.response.UserResponse;
import gabriela_21.webflux_course_reactive.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserControllerImpl implements UserController {

    private final UserService service;
    private final UserMapper mapper;


    @Override
    public ResponseEntity<Mono<Void>> save(final UserRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.save(request).then());
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> findById(String id) {
        return ResponseEntity.ok().body(
                service.findById(id).map(mapper::toResponse)
        );
    }

    @Override
    public ResponseEntity<Flux<UserResponse>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Mono<UserResponse>> update(String id, UserRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Mono<Void>> delete(String id) {
        return null;
    }
}
