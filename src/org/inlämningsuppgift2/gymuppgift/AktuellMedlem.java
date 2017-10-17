package org.inlämningsuppgift2.gymuppgift;

import java.time.LocalDate;

public interface AktuellMedlem {
	public String getPersonnr();
	public String getNamn();
	public LocalDate getDatum();
	public void printMe(AktuellMedlem o);
	public void plusPass();
}
