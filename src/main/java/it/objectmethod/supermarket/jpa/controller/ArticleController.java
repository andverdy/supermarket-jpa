package it.objectmethod.supermarket.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.supermarket.jpa.entity.Article;
import it.objectmethod.supermarket.jpa.service.ArticleService;
import it.objectmethod.supermarket.jpa.service.dto.ArticleDTO;

@RestController
@RequestMapping("/api/article")
public class ArticleController {

	@Autowired
	ArticleService articleService;

//
//	@GetMapping("/list")
//	public List<ArticleDTO> getArticles() {
//		List<ArticleDTO> articles = articleService.findAll();
//
//		return articles;
//	}

	@GetMapping("/by-code")
	public ArticleDTO getArticleByCode(@RequestParam(value = "getCod", required = false) String getCod) {
		ArticleDTO articleDto = null;

		if (getCod != null) {
			articleDto = articleService.findById(getCod);
		}

		return articleDto;
	}

	@PutMapping("/save")
	public ArticleDTO articleSave(@RequestBody Article art) {
		ArticleDTO articleDTO = null;

		if (articleService.findById(art.getCodArt()) != null) {

			articleDTO = articleService.save(art);

		}

		return articleDTO;
	}

}
