package com.demos.cine.model;

public class App {

	public static void main(String[] args) {
		Panier p1 = new Panier();
	Article livre1;
	try {
		livre1 = new Article("li1","roman",new Prix(45),15);
		p1.getAjouterArticle(livre1, 2);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("article non cree car prix incorrect");
	}
	Article livre2;
	try {
		livre2 = new Article("li4","cahier",new Prix(10),50);
		p1.getAjouterArticle(livre2, 4);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("article non cree car prix incorrect");
	}
	
	//System.out.println(livre1.toString());
	//System.out.println(livre2.toString());
	

	p1.affiche();
	p1.getNbrElt();
	
	//p1.getAjouterArticle(livre1,3);
	
	p1.affiche();
	p1.getNbrElt();
	
	System.out.println(p1.getPrixTotalHT());

	}

}
