package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Trinnskatt {

	public static void main(String[] args) {
		
		
		String bruttol�nn = ("Din bruttol�nn: ");
		int l�nn = parseInt(showInputDialog(bruttol�nn));
		//hh
		double trinn0 = 0;
		double trinn1 = 0.0093;
		double trinn2 = 0.0243;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		if(l�nn > 0 && l�nn <= 164100) {
			showMessageDialog(null, "Ditt trinnskatt er " + l�nn * trinn0);
			}
		
		else if(l�nn >= 164101 && l�nn <= 230950) {
			showMessageDialog(null, "Ditt trinnskatt er " + l�nn * trinn1);
			}
		
		else if(l�nn >= 230951 && l�nn <= 580650) {
			showMessageDialog(null, "Ditt trinnskatt er " + l�nn * trinn2);
			}
		
		else if(l�nn >= 580651 && l�nn <= 934050) {
			showMessageDialog(null, "Ditt trinnskatt er " + l�nn * trinn0);
			}	
		
		else    
			showMessageDialog(null, "Ditt trinnskatt er " + l�nn * trinn4);
		
		}

}
