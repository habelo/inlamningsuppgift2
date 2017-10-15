package org.inlämningsuppgift2.gymuppgift;

import java.util.Date;

public class Medlem extends Person{
	protected Date datum;
	public Medlem() {}
	public Medlem(String personnr, String namn, Date datum) {
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

}
