package tpfinal.tp;

import java.util.ArrayList;

public class Administrateur extends Employe {
	

	public Administrateur(Agence agence,Entreprise entreprise) {
		super(agence,entreprise);
	}
		// TODO Auto-generated constructor stub
	
	void attribuerMateriel(Empruntable mat,Emprunteur emp) {
		
		emp.ajouterAuStock(mat);
		
	
		
	}
	boolean recupererMateriel(Empruntable mat,Emprunteur emp) {
		emp.ajouterAuStock(mat);
		return true;}
	
	void attribuerMaterielAgence(Empruntable mat,Agence a) {
		a.stock.add(mat);
	}
	 void retirermateriel(Empruntable mat,Emprunteur emp) {
emp.stock.remove(mat);		 
		 }
	 
	 ArrayList<Empruntable> listemat(Employe emp){
		 return emp.listeMateriel();
		 
	 }
	 void listematAgence(Agence a){
		 for(int i=0;i<a.employés.size();i++) {

		 a.employés.get(i).listeMateriel();
	 }}
		 void listematEntreprise(Entreprise e) {
			 for(int i=0;i<e.Agences.size();i++) {

				 listematAgence(e.Agences.get(i));
			 }
			 
		 }
 ArrayList<Empruntable> stockEntreprise(Entreprise e){
	 ArrayList<Empruntable>  l = null ;

			 for(int i=0;i<e.Agences.size();i++) {
				 for(int j=0;j<e.Agences.get(i).stock.size();j++) {
			 
					 l.add(e.Agences.get(i).stock.get(j));
			 	 }}
			 return l;
			 
		 
	 
}
 ArrayList<Empruntable> stockEntreprise(){
	return  this.stock;
	 
	 
 }
 ArrayList<Empruntable> stockAgence(){
		return  this.stock;
		
		 
		 
	 }
 
 
 void transfererMateriel(Emprunteur emp,Empruntable mat,Emprunteur emp2) {
	 for (Empruntable p : emp.stock){
	        if (p.equals(mat)) {
	            emp2.ajouterAuStock(mat);
	            emp.stock.remove(mat);
	        }
	    }
	 
	 
 }
 void supprimermatdefectueuxde(Emprunteur emp) {
	 for(int i=0;i<emp.stock.size();i++) {
		 if(emp.stock.get(i).defectueux) {
			 emp.stock.remove(i);
		 }
		 
	 }

	 
	 
	 
 }
 void supprimerMaterielDefectueuxEntreprise(Entreprise a) {
	 for(int i=0;i<a.stock.size();i++) {
		 if(a.stock.get(i).defectueux) {
			 a.stock.remove(i);
		 }}}
 void supprimerMaterielDefectueuxAgence(Agence a) {
	 for(int i=0;i<a.stock.size();i++) {
		 if(a.stock.get(i).defectueux) {
			 a.stock.remove(i);
		 }
	 
 }
 
}
 public void achetermateriel( Empruntable mat) {
	 for (Empruntable p : this.entreprise.stock){
	        if (p.equals(mat)) {
this.ajouterAuStock(mat);
this.entreprise.ajouterAuStock(mat);
	 
 }}}
}
