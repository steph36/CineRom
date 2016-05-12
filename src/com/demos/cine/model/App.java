package com.demos.cine.model;

public class App {

	public static void main(String[] args) {
		
	Article livre1 = new Article("li1","roman",45,15);
	Article livre2 = new Article("li4","cahier",10,50);
	
	System.out.println(livre1.toString());
	System.out.println(livre2.toString());
	

	Panier p1 = new Panier();
	p1.getAjouterArticle(livre1, 2);
	p1.getAjouterArticle(livre2, 4);
	

	p1.affiche();
	p1.getNbrElt();
	
	p1.getAjouterArticle(livre1,3);
	
	p1.affiche();
	p1.getNbrElt();
	
	System.out.println(p1.getPrixTotalHT());

	}

}
