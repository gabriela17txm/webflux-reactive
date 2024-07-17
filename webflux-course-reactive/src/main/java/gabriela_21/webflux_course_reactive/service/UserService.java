package gabriela_21.webflux_course_reactive.service;

import gabriela_21.webflux_course_reactive.entity.UserEntity;
import gabriela_21.webflux_course_reactive.mapper.UserMapper;
import gabriela_21.webflux_course_reactive.model.request.UserRequest;
import gabriela_21.webflux_course_reactive.repository.UserRepository;
import gabriela_21.webflux_course_reactive.service.exception.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class UserService{
    private final UserRepository repository;
    private final UserMapper mapper;
    public Mono<UserEntity> save(final UserRequest request) {
        return repository.save(mapper.toEntity(request));

    }
    public Mono<UserEntity> findById(final String id) {
        return repository.findById(id).switchIfEmpty(Mono.error(
                new ObjectNotFoundException(
                        format("Object not found. Id: %s, Type: %s", id, UserEntity.class.getSimpleName())
                )
        ));
    }
}
