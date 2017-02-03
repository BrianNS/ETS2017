import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComprobarBonoloto extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8,
			textField9, textField10, textField11, textField12, textField13, textField14, textField15, textField16;
	JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13,
			label14, label15, label16;
	JButton Salir, Anotar;

	public static void main(String[] args) {

		ComprobarBonoloto c = new ComprobarBonoloto();
		c.pack();
		c.setVisible(true);
	}

	public ComprobarBonoloto() {
		label1 = new JLabel("Nº1");
		label2 = new JLabel("Nº2");
		label3 = new JLabel("Nº3");
		label4 = new JLabel("Nº4");
		label5 = new JLabel("Nº5");
		label6 = new JLabel("Nº6");
		label7 = new JLabel("Comp");
		label8 = new JLabel("Rein");
		label9 = new JLabel("nº1");
		label10 = new JLabel("nº2");
		label11 = new JLabel("nº3");
		label12 = new JLabel("nº4");
		label13 = new JLabel("nº5");
		label14 = new JLabel("nº6");
		label15 = new JLabel("comp");
		label16 = new JLabel("rein");
		textField1 = new JTextField(2);
		textField2 = new JTextField(2);
		textField3 = new JTextField(2);
		textField4 = new JTextField(2);
		textField5 = new JTextField(2);
		textField6 = new JTextField(2);
		textField7 = new JTextField(2);
		textField8 = new JTextField(1);
		textField9 = new JTextField(2);
		textField10 = new JTextField(2);
		textField11 = new JTextField(2);
		textField12 = new JTextField(2);
		textField13 = new JTextField(2);
		textField14 = new JTextField(2);
		textField15 = new JTextField(2);
		textField16 = new JTextField(1);

		textField1.setEditable(false);
		textField2.setEditable(false);
		textField3.setEditable(false);
		textField4.setEditable(false);
		textField5.setEditable(false);
		textField6.setEditable(false);
		textField7.setEditable(false);
		textField8.setEditable(false);
		textField9.setEditable(false);
		textField10.setEditable(false);
		textField11.setEditable(false);
		textField12.setEditable(false);
		textField13.setEditable(false);
		textField14.setEditable(false);
		textField15.setEditable(false);
		textField16.setEditable(false);

		Salir = new JButton("Salir");
		Anotar = new JButton("Comprobar");

		JPanel p = (JPanel) getContentPane();
		p.setLayout(new BorderLayout());
		p.setPreferredSize(new Dimension(470, 90));
		p.setVisible(true);
		setResizable(false);

		JPanel pant = new JPanel();
		p.add(pant);
		pant.add(label1);
		pant.add(textField1);
		pant.add(label2);
		pant.add(textField2);
		pant.add(label3);
		pant.add(textField3);
		pant.add(label4);
		pant.add(textField4);
		pant.add(label5);
		pant.add(textField5);
		pant.add(label6);
		pant.add(textField6);
		pant.add(label7);
		pant.add(textField7);
		pant.add(label8);
		pant.add(textField8);
		pant.add(label9);
		pant.add(textField9);
		pant.add(label10);
		pant.add(textField10);
		pant.add(label11);
		pant.add(textField11);
		pant.add(label12);
		pant.add(textField12);
		pant.add(label13);
		pant.add(textField13);
		pant.add(label14);
		pant.add(textField14);
		pant.add(label15);
		pant.add(textField15);
		pant.add(label16);
		pant.add(textField16);

		Salir.addActionListener(new evento());
		Anotar.addActionListener(new evento());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pant.setBackground(Color.cyan);
		pant.setVisible(true);

		int opcion = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Selector de opciones",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Entrar", "Salir" }, "opcion 1");

		if (opcion != -1)

			switch (opcion) {
			case 0:
				JOptionPane.showMessageDialog(null,
						"Los premios dados por aciertos son:\n6 aciertos = 200150,25€ \n5 aciertos = 159800,50€ \n4 aciertos = 1025,16€ \n3 aciertos = 6,5€ \nReintegro = 2€");
				int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0, r7 = 0, r8 = 0;
				Random v = new Random();
				r1 = v.nextInt(49) + 1;
				textField1.setText(Integer.toString(r1));
				r2 = v.nextInt(49) + 1;
				while (r2 == r1) {
					r2 = v.nextInt(49) + 1;
				}
				textField2.setText(Integer.toString(r2));
				r3 = v.nextInt(49) + 1;
				while (r3 == r2 || r3 == r1) {
					r3 = v.nextInt(49) + 1;
				}
				textField3.setText(Integer.toString(r3));
				r4 = v.nextInt(49) + 1;
				while (r4 == r3 || r4 == r2 || r4 == r1) {
					r4 = v.nextInt(49) + 1;
				}
				textField4.setText(Integer.toString(r4));
				r5 = v.nextInt(49) + 1;
				while (r5 == r4 || r5 == r3 || r5 == r2 || r5 == r1) {
					r5 = v.nextInt(49) + 1;
				}
				textField5.setText(Integer.toString(r5));
				r6 = v.nextInt(49) + 1;
				while (r6 == r5 || r6 == r4 || r6 == r3 || r6 == r2 || r6 == r1) {
					r6 = v.nextInt(49) + 1;
				}
				textField6.setText(Integer.toString(r6));
				r7 = v.nextInt(49) + 1;
				textField7.setText(Integer.toString(r7));
				r8 = v.nextInt(9) + 1;
				textField8.setText(Integer.toString(r8));
				textField9.setEditable(true);
				textField10.setEditable(true);
				textField11.setEditable(true);
				textField12.setEditable(true);
				textField13.setEditable(true);
				textField14.setEditable(true);
				textField15.setEditable(true);
				textField16.setEditable(true);
				pant.add(Salir);
				pant.add(Anotar);

				break;
			case 1:
				pant.add(Anotar);
				System.exit(0);
				break;
			}
		else {
			System.exit(0);
		}
	}

	private class evento implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equals("Salir")) {
			
				System.exit(0);
			}

			if (e.getActionCommand().equals("Comprobar")) {

				int r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16;
				int cont = 0;

				r1 = Integer.parseInt(textField1.getText());
				r2 = Integer.parseInt(textField2.getText());
				r3 = Integer.parseInt(textField3.getText());
				r4 = Integer.parseInt(textField4.getText());
				r5 = Integer.parseInt(textField5.getText());
				r6 = Integer.parseInt(textField6.getText());
				r8 = Integer.parseInt(textField8.getText());

				r9 = Integer.parseInt(textField9.getText());
				r10 = Integer.parseInt(textField10.getText());
				r11 = Integer.parseInt(textField11.getText());
				r12 = Integer.parseInt(textField12.getText());
				r13 = Integer.parseInt(textField13.getText());
				r14 = Integer.parseInt(textField14.getText());
				r15 = Integer.parseInt(textField15.getText());
				r16 = Integer.parseInt(textField16.getText());
				if (r9 < 0 || r9 > 49 || r10 < 0 || r10 > 49 || r11 < 0 || r11 > 49 || r12 < 0 || r12 > 49 || r13 < 0
						|| r13 > 49 || r14 < 0 || r14 > 49 || r15 < 0 || r15 > 49 || r16 < 0 || r16 > 9) {
					JOptionPane.showMessageDialog(null,
							"Rango de valores incorrectos, por favor, introduzca los números entre "
									+ "1 y 49 en los 6 primeros, y entre 0 y 9 en el reintegro");
				} else {
					if (r10 == r9 || r11 == r10 || r11 == r9 || r12 == r11 || r12 == r10 || r12 == r9 || r13 == r12
							|| r13 == r11 || r13 == r10 || r13 == r9 || r14 == r13 || r14 == r12 || r14 == r11
							|| r14 == r10 || r14 == r9) {
						JOptionPane.showMessageDialog(null, "Números repetidos, vuelva a intentarlo");
						System.exit(0);
					}
				}

				if (r9 == r1 || r9 == r2 || r9 == r3 || r9 == r4 || r9 == r5 || r9 == r6) {
					cont++;
				}
				if (r10 == r1 || r10 == r2 || r10 == r3 || r10 == r4 || r10 == r5 || r10 == r6) {
					cont++;
				}
				if (r11 == r1 || r11 == r2 || r11 == r3 || r11 == r4 || r11 == r5 || r11 == r6) {
					cont++;
				}
				if (r12 == r1 || r12 == r2 || r12 == r3 || r12 == r4 || r12 == r5 || r12 == r6) {
					cont++;
				}
				if (r13 == r1 || r13 == r2 || r13 == r3 || r13 == r4 || r13 == r5 || r13 == r6) {
					cont++;
				}
				if (r14 == r1 || r14 == r2 || r14 == r3 || r14 == r4 || r14 == r5 || r14 == r6) {
					cont++;
				}
				
				JOptionPane.showMessageDialog(null, "La bonoloto escogida es la: \nNúmero: " + r9 + " " + r10 + " "
						+ r11 + " " + r12 + " " + r13 + " " + r14 + "\nComplementario: " + r15 + "\nReintegro: " + r16);
				if (cont<=2 && r16==r8){
					 JOptionPane.showMessageDialog(null, "Lamentablemente no te has llevado ningún premio sin contar con el reintegro, ganas 2€ ");
				}
				if (cont<=2 && r16!=r8){
					 JOptionPane.showMessageDialog(null, "Lamentablemente no te has llevado ningún premio, vuelve a intentarlo la próxima vez. ");
				}
				switch (cont) {
				case 3:
					 if (r16==r8){
						 JOptionPane.showMessageDialog(null, "Enhorabuena, has tenido 3 aciertos además del reintegro, por ello ganas un total de 8,5€");
					 }else{
					JOptionPane.showMessageDialog(null, "Enhorabuena, has tenido 3 aciertos, por ello ganas 6,5 €");
					}
					break;
				case 4:
					if (r16==r8){
					JOptionPane.showMessageDialog(null, "Enhorabuena, has tenido 4 aciertos además del reintengro, por ello ganas un total de 1027,16 €");
					}else{
					JOptionPane.showMessageDialog(null, "Enhorabuena, has tenido 4 aciertos, por ello ganas 1025,16 €");
					}
					break;
				case 5:
					if (r16==r8){
					JOptionPane.showMessageDialog(null, "Enhorabuena, has tenido 5 aciertos además del reintegro, por ello ganas un total de 159802,50 €");
					}else{
						JOptionPane.showMessageDialog(null, "Enhorabuena, has tenido 5 aciertos, por ello ganas 159800,50 €");
					}
					break;
				case 6:
					if (r16==r8){
					JOptionPane.showMessageDialog(null, "Enhorabuena, has tenido 6 aciertos además del reintegro, por ello ganas un total de 200152,25 €");
					}else{
					JOptionPane.showMessageDialog(null, "Enhorabuena, has tenido 6 aciertos, por ello ganas 200152,25 €");
					}
					break;
				}

			}

		}
	}
}
