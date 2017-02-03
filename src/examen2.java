import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class examen2 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField tf_euro, tf_dolar;
	JLabel label1, label2;
	JButton Conversión, Limpiar;
	
	public static void main(String[] args){
		examen2 c = new examen2();
		c.pack();
		c.setVisible(true);
	}
	public examen2(){
		label1 = new JLabel("Valor1");
		label2 = new JLabel("Valor2");
		
		tf_euro = new JTextField(4);
		tf_dolar = new JTextField(4);
		
		tf_dolar.setEditable(false);		
		Conversión = new JButton("Conversión");
		Limpiar = new JButton("Limpiar");
		tf_dolar.setEditable(false);
		
		Container pantalla = getContentPane();
		pantalla.setPreferredSize(new Dimension(100, 150));
		pantalla.setLayout(new FlowLayout());
		
		pantalla.add(label1);
		pantalla.add(tf_euro);
		pantalla.add(label2);
		pantalla.add(tf_dolar);
		pantalla.add(Conversión);
		pantalla.add(Limpiar);
		Conversión.addActionListener(new Conversión());
		Limpiar.addActionListener(new Limpiar());
	}
	private class Conversión implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			double valor_euros = Double.parseDouble(tf_euro.getText());
			double valor_dolares = valor_euros*1.0665;
			
			tf_dolar.setText(""+valor_dolares);
		}
	}
	private class Limpiar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tf_dolar.setText("");
			tf_euro.setText("");
		}
	}
}
