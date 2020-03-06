package it.objectmethod.supermarket.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.supermarket.jpa.entity.Article;
import it.objectmethod.supermarket.jpa.repository.ArticleRepository;

@RestController
@RequestMapping("/api/article")
public class ArticleController {

	@Autowired
	ArticleRepository artRepo;

	@GetMapping("/list")
	public List<Article> getArticles() {
		List<Article> articles = artRepo.findAll();

		return articles;
	}

	@GetMapping("/by-code")
	public Article getArticleByCode(@RequestParam(value = "getCod", required = false) String getCod) {
		Article article = null;

		if (getCod != null) {
			article = artRepo.findById(getCod).get();
		}

		return article;
	}

	@PutMapping("/save")
	public Article articleSave(@RequestBody Article art) {

		if (artRepo.findById(art.getCodArt()) != null) {

			artRepo.save(art);

		}

		return art;
	}

}
