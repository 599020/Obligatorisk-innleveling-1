package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakterskala {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
		String innTxt = "Poengsum: ";
		int poeng = parseInt(showInputDialog(innTxt));
		
		if (poeng <= 100 && poeng >= 90) {
			showMessageDialog(null, "Karakter: A" );
		}
//		hh
		else if (poeng <= 89 && poeng >= 80) {
			showMessageDialog(null, "Karakter: B" );
		}
		
		else if (poeng <= 79 && poeng >= 60) {
			showMessageDialog(null, "Karakter: C" );
		}
		
		else if (poeng <= 59 && poeng >= 50) {
			showMessageDialog(null, "Karakter: D" );
		}
		
		else if (poeng <= 49 && poeng >= 40) {
			showMessageDialog(null, "Karakter: E" );
		}
		
		else if (poeng <= 39 && poeng >= 0) {
			showMessageDialog(null, "Karakter: F" );
		}
		
		else if (poeng > 100 || poeng < 0) {
			showMessageDialog(null, "Ugyldig poengsum");
			showMessageDialog(null, "prøv igjen");
		}
		}

	}

}
