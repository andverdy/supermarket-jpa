package it.objectmethod.supermarket.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import it.objectmethod.supermarket.jpa.entity.User;
import it.objectmethod.supermarket.jpa.repository.UserRepository;
import it.objectmethod.supermarket.jpa.service.dto.UserDTO;
import it.objectmethod.supermarket.jpa.service.mapper.UserMapper;

@Component
public class UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private UserMapper userMapper;

	public UserDTO save(UserDTO userDto) {

		User user = userMapper.toEntity(userDto);

		User u = userRepo.save(user);
		return userMapper.toDto(u);

	}

	public UserDTO findByUsernameAndPassword(String username, String password) {

		User user = userRepo.findByUsernameAndPassword(username, password);
		UserDTO userDto = userMapper.toDto(user);
		return userDto;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
