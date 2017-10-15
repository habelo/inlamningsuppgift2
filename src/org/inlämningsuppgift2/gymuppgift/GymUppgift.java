package org.inlämningsuppgift2.gymuppgift;


import java.util.*;

public class GymUppgift {
	public static void main(String[] args) {
		Date cal = Calendar.getInstance().getTime();
		Medlem Olle = new Medlem("5100","Olle",cal);
		
		List<Medlem> Medlemlistan = new ArrayList<Medlem>();
		Medlemlistan.add(Olle);
		
		for(Medlem o: Medlemlistan) {
			System.out.printf("%8s%n %8s%n %8s%n",o.namn,o.personnr,o.datum);
		}
	}

}
