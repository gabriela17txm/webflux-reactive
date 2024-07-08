package gabriela_21.webflux_course_reactive.mapper;

import gabriela_21.webflux_course_reactive.entity.UserEntity;
import gabriela_21.webflux_course_reactive.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    UserEntity toEntity(UserRequest request);
}
