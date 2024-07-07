package gabriela_21.webflux_course_reactive.repository;

import gabriela_21.webflux_course_reactive.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class UserRepository {
     private final ReactiveMongoTemplate mongoTemplate;

     public Mono<UserEntity> save(final UserEntity user){
         return mongoTemplate.save(user);
     }
}
