package it.objectmethod.supermarket.jpa.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.objectmethod.supermarket.jpa.dto.ArticleDTO;
import it.objectmethod.supermarket.jpa.entity.Article;

@Mapper(componentModel = "spring", uses = { IvaMapper.class, FamAssMapper.class })
public interface ArticleMapper extends EntityMapper<ArticleDTO, Article> {

	@Mapping(source = "iva.idIva", target = "idIva")
	@Mapping(source = "famAss.id", target = "idFamAss")
	ArticleDTO toDto(Article article);

}
