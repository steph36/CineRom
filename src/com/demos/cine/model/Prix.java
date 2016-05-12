package com.demos.cine.model;

public class Prix {

		private double valeur;

		public Prix(double valeur) throws Exception {
			if(valeur<0){
				throw new Exception("prix negatif");
				//on cree pas un objet prix negatif
			}else 	
			this.valeur = valeur;
		}
		
		public double getPrix(){
			return valeur;
		}
		
		public void setPrix(double valeur){
			this.valeur=valeur;
		}
		
}
