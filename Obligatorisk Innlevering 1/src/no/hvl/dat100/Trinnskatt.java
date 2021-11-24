package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Trinnskatt {

	public static void main(String[] args) {
		
		
		String bruttolønn = ("Din bruttolønn: ");
		int lønn = parseInt(showInputDialog(bruttolønn));
		//hh
		double trinn0 = 0;
		double trinn1 = 0.0093;
		double trinn2 = 0.0243;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		if(lønn > 0 && lønn <= 164100) {
			showMessageDialog(null, "Ditt trinnskatt er " + lønn * trinn0);
			}
		
		else if(lønn >= 164101 && lønn <= 230950) {
			showMessageDialog(null, "Ditt trinnskatt er " + lønn * trinn1);
			}
		
		else if(lønn >= 230951 && lønn <= 580650) {
			showMessageDialog(null, "Ditt trinnskatt er " + lønn * trinn2);
			}
		
		else if(lønn >= 580651 && lønn <= 934050) {
			showMessageDialog(null, "Ditt trinnskatt er " + lønn * trinn0);
			}	
		
		else    
			showMessageDialog(null, "Ditt trinnskatt er " + lønn * trinn4);
		
		}

}
