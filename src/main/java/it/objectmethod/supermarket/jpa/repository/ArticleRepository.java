package it.objectmethod.supermarket.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.supermarket.jpa.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, String> {

	
	
	
}
