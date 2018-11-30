package tpfinal.tp;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ComparatorMatTest {
    Agence a1, a2;
    Empruntable m1,m2,m3,m4,m5,m6,m8;
    @Before
    public void setUp() throws Exception {
    m3=new Empruntable(true);
    m4=new Empruntable(true);

    m5=new Empruntable(true);

    m6=new Empruntable(true);
    m8=new Empruntable(true);
}

    
    


	@Test
	public void test(){
		a1.ajouterAuStock(m1);
		a1.ajouterAuStock(m3);
		a2.ajouterAuStock(m4);
		
		a2.ajouterAuStock(m5);
	      Comparator c=new ComparatorMat();
	      c.compare(a1, a2);
	      

	
        Assert.assertEquals("agence qui a plus des mat defectueux est a1 ",a1.stock.size() , 2);


		
	}

}
