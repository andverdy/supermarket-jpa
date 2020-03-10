package it.objectmethod.supermarket.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.supermarket.jpa.repository.ArticleRepository;
import it.objectmethod.supermarket.jpa.service.dto.ArticleCartDTO;
import it.objectmethod.supermarket.jpa.service.mapper.ArticleCartMapper;

@Component
public class CartService {

	@Autowired
	private ArticleRepository artRepo;

	@Autowired
	private ArticleCartMapper cartMapper;

	public ArticleCartDTO findById(String id) {
		return cartMapper.toDto(artRepo.findById(id).get());
	}
}
