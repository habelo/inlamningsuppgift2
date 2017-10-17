package org.inlämningsuppgift2.gymuppgift;

import java.time.LocalDate;


public class Medlem extends Person implements AktuellMedlem{
	protected LocalDate datum;
	protected int antalPass;
	public Medlem() {}
	public Medlem(String personnr, String namn, LocalDate datum) {
		super(personnr, namn);
		this.datum=datum;
	}
	public String getPersonnr() {
		return personnr;
	}

	public void setPersonnr(String personnr) {
		this.personnr = personnr;
	}

	public String getNamn() {
		return namn;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void printMe(Medlem o) {
		System.out.printf("Ej aktiv medlem%n%8s%n%8s%n%8s%n",o.namn,o.personnr,o.datum);
	}
	@Override
	public void printMe(AktuellMedlem o) {
		System.out.printf("Aktiv medlem%n%8s%n%8s%n%8s%n",o.getNamn(),o.getPersonnr(),o.getDatum());
		
	}
	@Override
	public void plusPass() {
		antalPass++;
	}

}
