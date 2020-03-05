package it.objectmethod.supermarket.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articoli")
public class Article {

	@Id
//	@GeneratedValue(generator = "uuid")
//	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "CODART", columnDefinition = "LONGBLOB")
	private String codArt;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@Column(name = "PZCART")
	private Integer pzCart;

	@JoinColumn(name = "idFamAss")
	@ManyToOne
	private FamAss famAss;

	@JoinColumn(name = "idIva")
	@ManyToOne
	private Iva iva;

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

	public FamAss getFamAss() {
		return famAss;
	}

	public void setFamAss(FamAss famAss) {
		this.famAss = famAss;
	}

	public Iva getIva() {
		return iva;
	}

	public void setIva(Iva iva) {
		this.iva = iva;
	}

}