package com.demos.cine.model;

import java.util.ArrayList;

public class Panier {
	
	ArrayList <LignePanier> contenu = new ArrayList <LignePanier>();
	
	public double getPrixTotalHT(){
		double prixTotalHT=0;
		for(LignePanier li:contenu){
			prixTotalHT=prixTotalHT+li.getArticle().getPrix()*li.getQteCom();
		}
		
		return prixTotalHT;
	}
	
	
	

	public ArrayList<LignePanier> getContenu() {
		return contenu;
	}


	public void getAjouterArticle(Article a,int qte){
		boolean value = false;
		for(LignePanier li:contenu){
			if(li.getArticle().getReference().equals(a.getReference()))
			{		
			 li.setQteCom(li.getQteCom()+qte);
			 value = true;
			}	
		}
		
		if (value==false)
			contenu.add(new LignePanier(a,qte));
	}
	
	public void getNbrElt(){
		int nbrelt=0;
		for(LignePanier li:contenu){
			nbrelt= nbrelt+li.getQteCom();
		}
		System.out.println("le nombre d'element commande est "+nbrelt);
	}
	
	
	public void affiche(){
	
		for(LignePanier li:contenu){
			System.out.println(li.toString());
		}
	}
}	