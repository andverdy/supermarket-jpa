package it.objectmethod.supermarket.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectmethod.supermarket.jpa.entity.Article;
import it.objectmethod.supermarket.jpa.repository.ArticleRepository;
import it.objectmethod.supermarket.jpa.service.dto.ArticleDTO;
import it.objectmethod.supermarket.jpa.service.mapper.ArticleMapper;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository artRepo;

	@Autowired
	private ArticleMapper articleMapper;

//	public List<ArticleDTO> findAll() {
//		List<Article> articles = artRepo.findAll();
//
//		List<ArticleDTO> articlesDto = articleMapper.toDto(articles);
//
//		return articlesDto;
//	}

	public ArticleDTO findById(String id) {
		return articleMapper.toDto(artRepo.findById(id).get());
	}

	public ArticleDTO save(Article article) {
		Article a = artRepo.save(article);
		return articleMapper.toDto(a);
	}

}
