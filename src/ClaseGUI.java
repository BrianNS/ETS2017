//import java.util.Scanner;
import javax.swing.*;

public class ClaseGUI {

	public static void main(String[] args){
		
		//¿Recuerdas Scanner?
		//Scanner teclado=new Scanner("Texto");
		
		JFrame frame = new JFrame("Ventanita");
		frame.setDefaultCloseOperation(1);
		JLabel label = new JLabel("Hola Mundo DAM");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}