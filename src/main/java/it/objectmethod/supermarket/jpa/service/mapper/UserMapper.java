package it.objectmethod.supermarket.jpa.service.mapper;

import org.mapstruct.Mapper;

import it.objectmethod.supermarket.jpa.entity.User;
import it.objectmethod.supermarket.jpa.service.dto.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, User> {

	User toEntity(UserDTO userDto);

	UserDTO toDto(User user);
}
