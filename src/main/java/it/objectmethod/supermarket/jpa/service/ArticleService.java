package it.objectmethod.supermarket.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.supermarket.jpa.entity.Article;
import it.objectmethod.supermarket.jpa.repository.ArticleRepository;
import it.objectmethod.supermarket.jpa.service.dto.ArticleDTO;
import it.objectmethod.supermarket.jpa.service.mapper.ArticleMapper;

@Component
public class ArticleService {

	@Autowired
	private ArticleRepository artRepo;

	@Autowired
	private ArticleMapper articleMapper;

	public List<ArticleDTO> findAll() {
		List<Article> articlesList = artRepo.findAll();
		List<ArticleDTO> articlesListDto = new ArrayList<ArticleDTO>();
		for (Article e : articlesList) {
			ArticleDTO articleDto = articleMapper.toDto(e);
			articlesListDto.add(articleDto);
		}

		return articlesListDto;
	}

	public ArticleDTO findById(String id) {
		return articleMapper.toDto(artRepo.findById(id).get());
	}

	public ArticleDTO save(Article article) {
		Article a = artRepo.save(article);
		return articleMapper.toDto(a);
	}

}
