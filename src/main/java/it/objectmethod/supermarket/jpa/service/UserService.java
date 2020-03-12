package it.objectmethod.supermarket.jpa.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	public ResponseEntity<Long> findByUsernameAndPassword(String username, String password) {

		ResponseEntity<Long> userResp = null;

		Long token = null;
		Random random = new Random();
		token = random.nextLong();
		if (token < 0) {
			token *= -1;
		}

		if (username != null && password != null) {
			User userQuery = userRepo.findByUsernameAndPassword(username, password);

			if (userQuery != null && userQuery.getUsername().equals(username)
					&& userQuery.getPassword().equals(password)) {
				userResp = new ResponseEntity<>(token, HttpStatus.OK);
				System.out.println("sono nel 200");
			} else {
				userResp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
				System.out.println("sono nel 400");
			}
		}
		return userResp;
	}

}
