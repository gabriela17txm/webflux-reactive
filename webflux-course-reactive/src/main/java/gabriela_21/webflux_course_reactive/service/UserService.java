package gabriela_21.webflux_course_reactive.service;

import gabriela_21.webflux_course_reactive.entity.UserEntity;
import gabriela_21.webflux_course_reactive.mapper.UserMapper;
import gabriela_21.webflux_course_reactive.model.request.UserRequest;
import gabriela_21.webflux_course_reactive.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService{
    private final UserRepository repository;
    private final UserMapper mapper;
    public Mono<UserEntity> save(final UserRequest request) {
        return repository.save(mapper.toEntity(request));

    }
    public Mono<UserEntity> findById(final String id) {
        return repository.findById(id);
    }
}
