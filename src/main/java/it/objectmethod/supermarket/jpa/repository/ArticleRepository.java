package it.objectmethod.supermarket.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import it.objectmethod.supermarket.jpa.entity.Article;

@Component
public interface ArticleRepository extends JpaRepository<Article, String> {

}
