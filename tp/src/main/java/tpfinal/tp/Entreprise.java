package tpfinal.tp;

import java.util.ArrayList;


public class Entreprise extends Emprunteur {
	ArrayList<Agence> Agences=new ArrayList <Agence>();
	ArrayList<Employe> Employés=new ArrayList <Employe>();
	String nomEntreprise;


	public Entreprise(String a) {
		// TODO Auto-generated constructor stub
		this.nomEntreprise=a;
	}


	public ArrayList<Agence> getAgences() {
		return Agences;
	}


	public void setAgences(ArrayList<Agence> agences) {
		Agences = agences;
	}


	public ArrayList<Employe> getEmployés() {
		return Employés;
	}


	public void setEmployés(ArrayList<Employe> employés) {
		Employés = employés;
	}


	public String getNomEntreprise() {
		return nomEntreprise;
	}


	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	

}
