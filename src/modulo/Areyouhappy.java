package modulo;

import javax.swing.JOptionPane;

public class Areyouhappy {
public static void main(String[] args) {

	
String rb =JOptionPane.showInputDialog("are you happy?");	
	

if(rb.equals("yes")) {	
	
JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing");	
	
	
	
}	
if(rb.equals("no")) {		
String ax =JOptionPane.showInputDialog("do you want to be happy?");	
if(ax.equals("yes")) {	
JOptionPane.showMessageDialog(null,"change something");





	
	
	
	
}
if(ax.equals("no")) {	
JOptionPane.showMessageDialog(null,"keep doing whatever you're doing.");	
}
}
}	
}
