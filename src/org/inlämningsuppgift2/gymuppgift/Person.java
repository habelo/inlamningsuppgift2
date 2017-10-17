package org.inlämningsuppgift2.gymuppgift;

abstract public class Person {
	protected String personnr;
	protected String namn;
	
	Person(){}
	
	Person(String personnr, String namn){
		this.personnr=personnr;
		this.namn=namn;
	}

	public String getPersonnr() {
		return null;
	}

	public void setPersonnr() {}

	public String getNamn() {
		return null;
	}

	public void setNamn() {}
	public void printMe() {}

}
