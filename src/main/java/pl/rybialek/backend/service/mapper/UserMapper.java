package pl.rybialek.backend.service.mapper;

import pl.rybialek.backend.persistence.model.Role;
import pl.rybialek.backend.persistence.model.User;
import pl.rybialek.backend.web.dto.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

public final class UserMapper {

    public static final String COMMA = ",";

    private UserMapper() {
        //util class
    }

    public static List<UserDTO> convertUsersToUsersDTO(List<User> users) {
        return users.stream()
                .map(UserMapper::mapUserToUserDTO)
                .collect(Collectors.toList());
    }

    public static UserDTO mapUserToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRoles(String.join(COMMA,
                user.getRoles()
                        .stream()
                        .map(Role::getAuthority)
                        .collect(Collectors.toSet())));

        return userDTO;
    }
}
