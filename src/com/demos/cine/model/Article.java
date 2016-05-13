package com.demos.cine.model;

public class Article {
	//article
	private String reference;
	private String designation;
	private double prixHT;
	private int  qteStock;

	private String type;

	private boolean dematerialise;

	
	
	public Article() {
	}


	public Article(String reference, String designation, double prix, int qtestock) {
		this.reference = reference;
		this.designation = designation;
		this.prixHT = prix;
		this.qteStock = qtestock;
		this.dematerialise = false;
	}
	
	//objet dematerialise
	public Article(String reference, String designation, double prix) {
		this.reference = reference;
		this.designation = designation;
		this.prixHT = prix;
		this.qteStock=0;
		this.dematerialise = true;
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

	


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}



	public boolean isDematerialise() {
		return dematerialise;
	}


	public void setDematerialise(boolean dematerialise) {
		this.dematerialise = dematerialise;
	}


	public String toString() {

		if(!isDematerialise())
			return "reference=" + reference + ", designation=" + designation + ", prixHT=" + prixHT + ", qteStock="+ qteStock;
		else
			return "reference=" + reference + ", designation=" + designation + ", prixHT=" + prixHT + ", objet dematerialise";
	
		
	}
	
		
}
