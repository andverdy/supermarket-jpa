package it.objectmethod.supermarket.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "iva")
public class Iva {

	@GeneratedValue
	@Id
	@Column(name = "IDIVA")
	private Integer idIva;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@JsonIgnore
	@JoinColumn(name = "IDIVA")
	@OneToMany
	private List<Article> articles;

	public Integer getIdIva() {
		return idIva;
	}

	public void setIdIva(Integer idIva) {
		this.idIva = idIva;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
