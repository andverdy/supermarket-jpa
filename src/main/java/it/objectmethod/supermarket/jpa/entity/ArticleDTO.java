package it.objectmethod.supermarket.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articoli")
public class ArticleDTO {

	@Id
	@Column(name = "CODART", columnDefinition = "LONGBLOB")
	private String codArt;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@Column(name = "PZCART")
	private Integer pzCart;

	@Column(name = "idFamAss")
	private Integer idFamAss;

	@Column(name = "idIva")
	private Integer idIva;

	public String getCodArt() {
		return codArt;
	}

	public void setCodArt(String codArt) {
		this.codArt = codArt;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getPzCart() {
		return pzCart;
	}

	public void setPzCart(Integer pzCart) {
		this.pzCart = pzCart;
	}

	public Integer getIdFamAss() {
		return idFamAss;
	}

	public void setIdFamAss(Integer idFamAss) {
		this.idFamAss = idFamAss;
	}

	public Integer getIdIva() {
		return idIva;
	}

	public void setIdIva(Integer idIva) {
		this.idIva = idIva;
	}

}