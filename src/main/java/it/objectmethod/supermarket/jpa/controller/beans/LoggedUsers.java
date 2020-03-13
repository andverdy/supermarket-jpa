package it.objectmethod.supermarket.jpa.controller.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import it.objectmethod.supermarket.jpa.entity.User;

@Component
public class LoggedUsers {

	private Map<Long, User> mapLoggedUsers;

	public Map<Long, User> getMapLoggedUsers() {
		if(this.mapLoggedUsers == null) {
			this.mapLoggedUsers = new HashMap<Long, User>();
		}
		return mapLoggedUsers;
	}

}
