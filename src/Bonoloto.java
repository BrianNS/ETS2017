import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bonoloto extends JFrame{
	JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8;
	JLabel label1, label2, label3, label4, label5, label6, label7, label8;
	JButton bRan, bMan, bSal;
	JPanel jp, jp2;
	
	public static void main(String[] args){
		Bonoloto c = new Bonoloto();
		c.pack();
		c.setVisible(true);
	}
	
	public Bonoloto() {
		label1 = new JLabel("Nº1");
		label2 = new JLabel("Nº2");
		label3 = new JLabel("Nº3");
		label4 = new JLabel("Nº4");
		label5 = new JLabel("Nº5");
		label6 = new JLabel("Nº6");
		label7 = new JLabel("Comp");
		label8 = new JLabel("Rein");
		textField1 = new JTextField(2);
		textField1.setEditable(false);
		textField2 = new JTextField(2);
		textField2.setEditable(false);
		textField3 = new JTextField(2);	
		textField3.setEditable(false);
		textField4 = new JTextField(2);	
		textField4.setEditable(false);
		textField5 = new JTextField(2);	
		textField5.setEditable(false);
		textField6 = new JTextField(2);	
		textField6.setEditable(false);
		textField7 = new JTextField(2);	
		textField7.setEditable(false);
		textField8 = new JTextField(2);
		textField8.setEditable(false);															
		bMan = new JButton("Manual");
		bRan = new JButton("Random");		
		bSal = new JButton("Salir");
									
		
		jp = new JPanel();
		jp.setPreferredSize(new Dimension(500, 60));
		jp.setLayout(new FlowLayout());
		jp.add(label1);
		jp.add(textField1);
		jp.add(label2);
		jp.add(textField2);
		jp.add(label3);
		jp.add(textField3);
		jp.add(label4);
		jp.add(textField4);
		jp.add(label5);
		jp.add(textField5);
		jp.add(label6);
		jp.add(textField6);
		jp.add(label7);
		jp.add(textField7);
		jp.add(label8);
		jp.add(textField8);
		jp.add(bMan);
		jp.add(bRan);
		jp.add(bSal);
		
		bRan.addActionListener(new evento());
		bMan.addActionListener(new evento());
		bSal.addActionListener(new salir());
		jp.setBackground(Color.green);
		jp.setVisible(true);		
		setResizable(false);		
		setLocationRelativeTo(null);
		add(jp);
		pack();
		
						
		
	}
	public class salir implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			System.exit(0);

		}
	}
		
			private class evento implements ActionListener{
				public void actionPerformed(ActionEvent e){
																
							
					if (e.getActionCommand().equals("Manual")){
						
						textField1.setEditable(true);
						textField2.setEditable(true);
						textField3.setEditable(true);
						textField4.setEditable(true);
						textField5.setEditable(true);
						textField6.setEditable(true);
						textField7.setEditable(true);
						textField8.setEditable(true);
																																	
						}
				if (e.getActionCommand().equals("Random")){
					
					textField1.setEditable(false);
					textField2.setEditable(false);
					textField3.setEditable(false);
					textField4.setEditable(false);
					textField5.setEditable(false);
					textField6.setEditable(false);
					textField7.setEditable(false);
					textField8.setEditable(false);
					
					Random v = new Random();
					
					int r1, r2, r3, r4, r5, r6, r7, r8;
					r1 = v.nextInt(49)+1;
					textField1.setText(Integer.toString(r1));
					
					do {
						r2 = v.nextInt(49) + 1;
						textField2.setText(Integer.toString(r2));
					} while (r1 == r2);
					do {
						r3 = v.nextInt(49) + 1;
						textField3.setText(Integer.toString(r3));
					} while (r3 == r2 || r3 == r1);

					do {
						r4 = v.nextInt(49) + 1;
						textField4.setText(Integer.toString(r4));
					} while (r4 == r1 || r4 == r2 || r4 == r3);

					do {
						r5 = v.nextInt(49) + 1;
						textField5.setText(Integer.toString(r5));
					} while (r5 == r1 || r5 == r2 || r5 == r3 || r5 == r4);
					do {
						r6 = v.nextInt(49) + 1;
						textField6.setText(Integer.toString(r6));
					} while (r6 == r1 || r6 == r2 || r6 == r3 || r6 == r4 || r6 == r5);
				
					r7 = v.nextInt(10);
					textField7.setText(Integer.toString(r7));
					r8 = v.nextInt(10);
					textField8.setText(Integer.toString(r8));
				}
				}
				}
	}