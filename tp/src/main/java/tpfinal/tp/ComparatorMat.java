package tpfinal.tp;

import java.util.Comparator;


public class ComparatorMat implements Comparator<Agence> {

	public ComparatorMat() {
		// TODO Auto-generated constructor stub
	}

	public int compare(Agence o1, Agence o2) {
		// TODO Auto-generated method stub
		int s1=0,s2=0;
		 for(int i=0;i<o1.stock.size();i++) {
			 if (o1.stock.get(i).defectueux) {
				 s1++;
			 }
		 }
		 for(int i=0;i<o2.stock.size();i++) {
			 if (o2.stock.get(i).defectueux) {
				 s2++;
			 }
		 }
		 return s1-s2;

	}

}
