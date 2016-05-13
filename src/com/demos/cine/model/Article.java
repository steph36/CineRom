package com.demos.cine.model;

public class Article {
	//article
	private String reference;
	private String designation;
	private double prixHT;
	private int  qteStock;
	
	
	public Article() {
	}


	public Article(String reference, String designation, double prix, int qtestock) {
		this.reference = reference;
		this.designation = designation;
		this.prixHT = prix;
		this.qteStock = qtestock;
	}


	public double getPrix() {
		return prixHT;
	}


	public void setPrix(double prix) {
		this.prixHT = prix;
	}


	public String getReference() {
		return reference;
	}


	public String getDesignation() {
		return designation;
	}


	public int getQtestock() {
		return qteStock;
	}
	
	public void incrementStock(int val){
		this.qteStock = this.qteStock+val;
	}

	public void decrementStock(int val){
		this.qteStock = this.qteStock-val;
	}


	public String toString() {
		return "Article [reference=" + reference + ", designation=" + designation + ", prixHT=" + prixHT + ", qteStock="
				+ qteStock + "]";
	}
	
	
}
