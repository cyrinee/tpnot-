package tpfinal.tp;

import java.util.ArrayList;

public class Agence extends Emprunteur {
	ArrayList<Employe> employés=new ArrayList <Employe>();
String nom;

	public Agence(String nom) {
		// TODO Auto-generated constructor stub
		this.nom=nom;
		
	}
	

	public ArrayList<Employe> getEmployes() {
		return employés;
	}

	public void setEmployés(ArrayList<Employe> employés) {
		this.employés = employés;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
