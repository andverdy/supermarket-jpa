package it.objectmethod.supermarket.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.supermarket.jpa.repository.ArticleRepository;
import it.objectmethod.supermarket.jpa.service.ArticleService;
import it.objectmethod.supermarket.jpa.service.dto.ArticleDTO;

@RestController
@CrossOrigin
@RequestMapping("/api/articles")
public class ArticleController {

	@Autowired
	ArticleService articleService;

	@Autowired
	ArticleRepository artRepo;

	@GetMapping("/list")
	public List<ArticleDTO> getArticles() {
		List<ArticleDTO> articles = articleService.findAll();
		return articles;
	}

	@GetMapping("/by-code")
	public ArticleDTO getArticleByCode(@RequestParam(value = "getCod", required = false) String getCod) {
		ArticleDTO articleDto = null;

		if (getCod != null) {
			articleDto = articleService.findById(getCod);
		}

		return articleDto;
	}

	@PutMapping("/save")
	public ArticleDTO articleSave(@RequestBody ArticleDTO artDTO) {

		ArticleDTO articleDTO = articleService.save(artDTO);

		return articleDTO;
	}

//	@GetMapping("/login")
//	public Long login() {
//		System.out.println("effettuo login");
//		return 1L;
//	}
//
//	@GetMapping("/hello")
//	public Long hello() {
//		System.out.println("effettuo login");
//		return 1L;
//	}

}