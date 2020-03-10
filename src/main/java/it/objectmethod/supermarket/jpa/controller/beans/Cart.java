package it.objectmethod.supermarket.jpa.controller.beans;

import java.util.HashMap;
import java.util.Map;

import it.objectmethod.supermarket.jpa.service.dto.ArticleCartDTO;




public class Cart {

	private Map<String, ArticleCartDTO> articoli = new HashMap<String, ArticleCartDTO>();
	

	public Map<String, ArticleCartDTO> getArticoli() {
		return articoli;
	}

	public void setArticoli(Map<String, ArticleCartDTO> articoli) {
		this.articoli = articoli;
	}

}
