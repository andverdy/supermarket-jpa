package it.objectmethod.supermarket.jpa.controller.beans;

import java.util.HashMap;
import java.util.Map;

import it.objectmethod.supermarket.jpa.entity.ArticleCart;


public class Cart {

	private Map<String, ArticleCart> articoli = new HashMap<String, ArticleCart>();
	

	public Map<String, ArticleCart> getArticoli() {
		return articoli;
	}

	public void setArticoli(Map<String, ArticleCart> articoli) {
		this.articoli = articoli;
	}

}
