import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class examenb2 extends JFrame {
	JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7;
	JLabel label1,label2,label3,label4,label5,label6,label7;
	JButton Media,Finalizar,resetear;
	public static void main(String[] args) {
    	   examenb2 c= new examenb2();
    	   c.pack();  
		   c.setVisible(true);

	}
	public examenb2() {
		  label1=new JLabel("Valor1");
	      label2=new JLabel("Valor2");
	      label3=new JLabel("Valor3");
	      label4=new JLabel("Resultado");
	      label5=new JLabel("Finalizar");
	      label6=new JLabel("Resetear");
	      label7=new JLabel("Media");
	      textField1=new JTextField(4);
	      textField2=new JTextField(4);
	      textField3=new JTextField(4);
	      textField4=new JTextField(4);
	      textField5=new JTextField(4);
	      textField6=new JTextField(4);
	      textField7=new JTextField(4);
	      textField4.setEditable(false);
	      Media=new JButton();
	      Finalizar=new JButton();
	      resetear=new JButton();
	      textField4.setEditable(false);
	      
	      JPanel pantalla = new JPanel();
	      pantalla.setPreferredSize(new Dimension (20,400));
	      pantalla.setLayout(new FlowLayout()); 
	      pantalla.add(label1);
	      pantalla.add(textField1);
	      pantalla.add(label2);
	      pantalla.add(textField2);
	      pantalla.add(label3);
	      pantalla.add(textField3);
	      pantalla.add(Finalizar);
	      pantalla.add(label5);
	      
		  pantalla.add(resetear);
		  pantalla.add(label6);
	     
	      pantalla.add(label7);
	      
		  pantalla.add(Media);
		  pantalla.add(label4);
		  pantalla.add(textField4);
		  Media.addActionListener(new Media());
		  Finalizar.addActionListener(new Finalizar(this));
		  resetear.addActionListener(new Resetear());
		  
		  getContentPane().add(pantalla);
	
		  pantalla.setVisible(true);
	
	}
	private class Media implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int valor1,valor2,valor3,resultado=0;
			valor1= Integer.parseInt(textField1.getText());
			valor2= Integer.parseInt(textField2.getText());		
			valor3= Integer.parseInt(textField3.getText());
			resultado=(valor1 + valor2+valor3)/3;
			
			textField4.setText(Integer.toString(resultado));
		}
	}
	private class Resetear implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textField1.setText("");
			textField2.setText("");	
			textField3.setText("");
		}
	}
	private class Finalizar implements ActionListener {
		private JFrame parent;
		public Finalizar(JFrame parent){
			this.parent = parent;
		}
		public void actionPerformed(ActionEvent e) {
	    	this.parent.dispose();
		}
	}
}