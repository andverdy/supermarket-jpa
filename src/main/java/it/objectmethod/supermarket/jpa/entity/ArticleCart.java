package it.objectmethod.supermarket.jpa.entity;

public class ArticleCart extends Article {

	private int quantita;

	public ArticleCart() {
	}

	public ArticleCart(Article article) {

		this.setCodArt(article.getCodArt());
		this.setDescrizione(article.getDescrizione());
		this.setFamAss(article.getFamAss());
		this.setIva(article.getIva());
		this.setPzCart(article.getPzCart());

	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

}
