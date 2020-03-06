package it.objectmethod.supermarket.jpa.controller.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CartMap {

	Map<Integer, Cart> carts;

	public Map<Integer, Cart> getCarrelli() {
		if(this.carts == null) {
			this.carts = new HashMap<Integer, Cart>();
		}
		return carts;
	}

}
