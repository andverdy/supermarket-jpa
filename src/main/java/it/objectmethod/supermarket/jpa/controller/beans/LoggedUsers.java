package it.objectmethod.supermarket.jpa.controller.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import it.objectmethod.supermarket.jpa.service.dto.UserDTO;

@Component
public class LoggedUsers {

	private Map<Long, UserDTO> mapLoggedUsers;

	public Map<Long, UserDTO> getMapLoggedUsers() {
		if(this.mapLoggedUsers == null) {
			this.mapLoggedUsers = new HashMap<Long, UserDTO>();
		}
		return mapLoggedUsers;
	}

}
