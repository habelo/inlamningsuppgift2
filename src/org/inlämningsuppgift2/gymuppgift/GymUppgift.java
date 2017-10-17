package org.inl�mningsuppgift2.gymuppgift;

import java.io.*;
import java.text.Format;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class GymUppgift {
	File fil = new File("C:\\Users\\Null\\Desktop\\skola\\Costumers.txt"); //skapa Paths ist?

;	public static void main(String[] args) {
	GymUppgift start = new GymUppgift();
//		LocalDate cal = LocalDate.now();
//		Medlem Olle = new Medlem("5100","Olle",cal);
//		
//		List<Medlem> Medlemlistan = new ArrayList<Medlem>();
//		Medlemlistan.add(Olle);
//		
//		for(Medlem o: Medlemlistan) {
//			System.out.printf("%8s%n %8s%n %8s%n",o.namn,o.personnr,o.datum);
//			}
	}//mm
	public GymUppgift() {
		boolean k�r=true;
		String personnr="";
		String namn="";
		String datum="";
		DateTimeFormatter datumFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Scanner inl�s = new Scanner(System.in);
		System.out.println("Namn/personnr p� bes�kande:");
		String svar= inl�s.nextLine();
		List<AktuellMedlem> aktuellMedlemListan = new ArrayList<>();
		List<Medlem> medlemListan = new ArrayList<>();
		
		
		try(BufferedReader infil = new BufferedReader(new FileReader(fil))){
			Scanner sc = new Scanner(infil);
			while(sc.hasNext()) {
			sc.useDelimiter(",");
			personnr=sc.next();
			sc.useDelimiter(" ");
			sc.next(); //tar bort komma
			namn= sc.nextLine().trim();
			datum=sc.nextLine();
			LocalDate tempDatum = LocalDate.parse(datum, datumFormat);
			medlemListan.add(new Medlem(personnr, namn,tempDatum));
			}//w
			
			for(Medlem o: medlemListan) {
				if(o.datum.plusYears(1).isAfter(LocalDate.now()))
					aktuellMedlemListan.add(o);
						
				}//f
	
			
			for(AktuellMedlem o: aktuellMedlemListan)
				if(svar.equalsIgnoreCase(o.getNamn())||svar.equalsIgnoreCase(o.getPersonnr())) {
					o.printMe(o);
					k�r=false;
				}//if
			while(k�r) {
				for(Medlem o: medlemListan) {
					if(svar.equalsIgnoreCase(o.getNamn())||svar.equalsIgnoreCase(o.getPersonnr())) {
						o.printMe(o);
						k�r=false;
					}//if
				}//for
				System.out.println("Felstavat eller aldrig varit medlem");
				k�r=false;
			}//wh
				
		}//try
		catch(FileNotFoundException e) {
			System.out.println("Filen hittades ej");
		}//c
		catch(IOException e) {
			System.out.println("Fel inl�s");
		}//c2
	}//const
	

}//mc
