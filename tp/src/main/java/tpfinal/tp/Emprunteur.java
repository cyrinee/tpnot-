package tpfinal.tp;

import java.util.ArrayList;

public class Emprunteur {
	ArrayList<Empruntable> stock=new ArrayList <Empruntable>();


	public Emprunteur() {
		// TODO Auto-generated constructor stub
	}

	public void ajouterAuStock(Empruntable mat) {
		this.stock.add(mat);
		
		
		
	}
	ArrayList<Empruntable> listeMateriel(){
		return this.stock;
		
	}
	/*public boolean perdreMateriel(Empruntable mat) {
		
			
		
		
	}*/
	
}
