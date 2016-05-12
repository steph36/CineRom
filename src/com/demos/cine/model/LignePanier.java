package com.demos.cine.model;

public class LignePanier {

	private Article article;
	
	private int qteCom;

	
	
	public LignePanier() {
	
	}



	public LignePanier(Article article, int qtecom) {
		this.article = article;
		this.qteCom = qtecom;
	}



	public Article getArticle() {
		return article;
	}



	public void setArticle(Article article) {
		this.article = article;
	}



	public int getQteCom() {
		return qteCom;
	}



	public void setQteCom(int qteCom) {
		this.qteCom = qteCom;
	}



	
	public String toString() {
		return "LignePanier [article=" + article.getReference() + ", qteCom=" + qteCom + "]";
	}
	
	
	
	
}
