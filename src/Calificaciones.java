import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calificaciones extends JFrame {
	JTextField textField1, textField2, textField3, textField4;
	JLabel label1, label2, label3, label4;
	JButton bMedia, bLimpiar;

	
	public static void main(String[] args){
		Calificaciones c = new Calificaciones();
		c.pack();
		c.setVisible(true);

	}
	public Calificaciones(){
		label1 = new JLabel("Nota1: ");
		label2 = new JLabel("Nota2: ");
		label3 = new JLabel("Nota3: ");
		label4 = new JLabel("Nota media final: ");
		textField1 = new JTextField(2);
		textField1.setEditable(true);
		textField2 = new JTextField(2);
		textField2.setEditable(true);
		textField3 = new JTextField(2);
		textField3.setEditable(true);
		textField4 = new JTextField(2);
		textField4.setEditable(false);
		bMedia = new JButton("Mostrar media");
		bLimpiar = new JButton("Borrar");
		
		JPanel p = (JPanel) getContentPane();
		p.setLayout(new FlowLayout());
		p.setPreferredSize(new Dimension(470, 90));
		p.setVisible(true);
		setResizable(false);
		
		JPanel pant = new JPanel();
		p.add(pant);
		pant.setPreferredSize(new Dimension(500, 60));
		pant.setLayout(new FlowLayout());
		pant.add(label1);
		pant.add(textField1);
		pant.add(label2);
		pant.add(textField2);
		pant.add(label3);
		pant.add(textField3);
		pant.add(label4);
		pant.add(textField4);
		pant.add(bMedia);
		pant.add(bLimpiar);
		
	
		bMedia.addActionListener(new evento());
		bLimpiar.addActionListener(new evento());
		pant.setVisible(true);		
		setResizable(false);		
		setLocationRelativeTo(null);
		add(pant);
		pack();
	}
		private class evento implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				if (e.getActionCommand().equals("Mostrar media")){
					double n1, n2, n3, nres;
					
					n1 = Double.parseDouble(textField1.getText());
					n2 = Double.parseDouble(textField2.getText());
					n3 = Double.parseDouble(textField3.getText());
					
					
					double media = (n1+n2+n3)/3;
					textField4.setText(Double.toString(media));
				}
				if (e.getActionCommand().equals("Borrar")){
					textField1.setText("");
					textField2.setText("");
					textField3.setText("");
					textField4.setText("");
				}
			}
		}
	}