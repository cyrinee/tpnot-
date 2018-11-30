package tpfinal.tp;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Emprunteur2Test extends TestCase {
    Emprunteur e1 = new Emprunteur();
    Empruntable emp=new Empruntable();


	    @Test
	    public void ajouterAuStock() {
	        int stock = e1.listeMateriel().size();
	        e1.ajouterAuStock(emp);

	        Assert.assertEquals("ajouterAuStock: fail", stock+1, e1.listeMateriel().size());
	    }

	    @Test
	    public void listeMateriel() {
	        e1.stock = new ArrayList<Empruntable>();
	        int stock = e1.stock.size();
	        e1.stock.add(emp);

	        int newStock = e1.listeMateriel().size();

	        Assert.assertEquals("listeMateriel: fail", stock+1, newStock);
	    }

	   // @Test
	   /* public void perdreMateriel() {
	        Empruntable emprunt1 = new UC();
	        e1.listeMateriel().add(emprunt1);

	        boolean result = e1.perdreMateriel(emprunt1);

	        Assert.assertEquals("perdreMateriel: méthode fail", true, result);
	        Assert.assertEquals("perdreMateriel: taille fail", 0, e1.listeMateriel().size());
	    }*/
	}
