import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculadora extends JFrame {
	//Variables inicializadas:
	JButton bMas, bMenos, bDiv, bMult, bRes;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bCom, bBor;
	JTextField pant;
	String mostrar = "";
	String dato = "";
	Double num1;
	Double num2;
	Double res;
	int resu;
	char op;
	char let;

	public Calculadora() {
		try {
			UIManager.getSystemLookAndFeelClassName();
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {

		}
		Font f = new Font("Calibri",3,20);
		setPreferredSize(new Dimension(200, 200));

		// Panel Principal
		JPanel p = new JPanel(new BorderLayout());
		// Panel con el JTexfield que muestra operaciones y resultado
		JPanel text = new JPanel(new FlowLayout());
		// Panel con los botones de las operaciones.
		JPanel op = new JPanel(new GridLayout(0, 1));
		// Panel con los botones numericos.
		JPanel num = new JPanel(new GridLayout(4, 3));
		// Cuadro de texto para mostrar operaciones y resultado.
		 
		Dimension t = new Dimension(text.getSize());
		pant = new JTextField(11);
		pant.setSize(t);
		pant.setHorizontalAlignment(SwingConstants.CENTER);
		pant.setFont(f);
	
		// Botones de las operaciones
		ActionListener Oper = new Operaciones();
		bMas = new JButton("+");
		bMas.setActionCommand("bMas");
		bMas.addActionListener(Oper);
		bMas.setFont(f);
		
		bMenos = new JButton("-");
		bMenos.setActionCommand("bMenos");
		bMenos.addActionListener(Oper);
		bMenos.setFont(f);
		
		bDiv = new JButton("/");
		bDiv.setActionCommand("bDiv");
		bDiv.addActionListener(Oper);
		bDiv.setFont(f);
		
		bMult = new JButton("*");
		bMult.setActionCommand("bMult");
		bMult.addActionListener(Oper);
		bMult.setFont(f);
		
		bRes = new JButton("=");
		bRes.setActionCommand("bRes");
		bRes.addActionListener(Oper);
		bRes.setFont(f);
		// Botones numericos
		ActionListener Datos = new IntroducirDatos();
		b1 = new JButton("1");
		b1.setActionCommand("b1");
		b1.addActionListener(Datos);
		b1.setFont(f);
		
		b2 = new JButton("2");
		b2.setActionCommand("b2");
		b2.addActionListener(Datos);
		b2.setFont(f);
		
		b3 = new JButton("3");
		b3.setActionCommand("b3");
		b3.addActionListener(Datos);
		b3.setFont(f);
		
		b4 = new JButton("4");
		b4.setActionCommand("b4");
		b4.addActionListener(Datos);
		b4.setFont(f);
		
		b5 = new JButton("5");
		b5.setActionCommand("b5");
		b5.addActionListener(Datos);
		b5.setFont(f);
		
		b6 = new JButton("6");
		b6.setActionCommand("b6");
		b6.addActionListener(Datos);
		b6.setFont(f);
		
		b7 = new JButton("7");
		b7.setActionCommand("b7");
		b7.addActionListener(Datos);
		b7.setFont(f);
		
		b8 = new JButton("8");
		b8.setActionCommand("b8");
		b8.addActionListener(Datos);
		b8.setFont(f);
		
		b9 = new JButton("9");
		b9.setActionCommand("b9");
		b9.addActionListener(Datos);
		b9.setFont(f);
		
		bCom = new JButton(",");
		bCom.setActionCommand("bCom");
		bCom.addActionListener(Datos);
		bCom.setFont(f);
		
		b0 = new JButton("0");
		b0.setActionCommand("b0");
		b0.addActionListener(Datos);
		b0.setFont(f);
		
		bBor = new JButton("C");
		bBor.setActionCommand("bBor");
		bBor.addActionListener(Datos);
		bBor.setFont(f);
		// Añade el JTextField pant al JPanel text
		text.add(pant);
		// Añade los botones de las operaciones al JPanel OP
		op.add(bMas);
		op.add(bMenos);
		op.add(bDiv);
		op.add(bMult);
		op.add(bRes);
		// Añade los botones numericos al JPanel num
		num.add(b1);
		num.add(b2);
		num.add(b3);
		num.add(b4);
		num.add(b5);
		num.add(b6);
		num.add(b7);
		num.add(b8);
		num.add(b9);
		num.add(bCom);
		num.add(b0);
		num.add(bBor);
		// Añade los diferentes paneles en una posicion del Jpanel principal p
		p.add(text, BorderLayout.PAGE_START);
		p.add(op, BorderLayout.LINE_END);
		p.add(num, BorderLayout.CENTER);
		add(p);
		pack();
	}
	//Metodo main que inicia la calculadora
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		c.setVisible(true);
		c.setDefaultCloseOperation(1);
		c.setResizable(false);
		c.setLocationRelativeTo(null);
	}
	// Evento para introducir los datos en la calculadora por pantalla
	public class IntroducirDatos implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("b1")) {
				if(pant.isEditable()){
					dato = "1";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("b2")) {
				if(pant.isEditable()){
					dato = "2";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("b3")) {
				if(pant.isEditable()){
					dato = "3";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("b4")) {
				if(pant.isEditable()){
					dato = "4";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("b5")) {
				if(pant.isEditable()){
					dato = "5";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("b6")) {
				if(pant.isEditable()){
					dato = "6";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("b7")) {
				if(pant.isEditable()){
					dato = "7";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("b8")) {
				if(pant.isEditable()){
					dato = "8";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("b9")) {
				if(pant.isEditable()){
					dato = "9";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("b0")) {
				if(pant.isEditable()){
					dato = "0";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("bCom")) {
				if(pant.isEditable()){
					dato = ".";
					mostrar += dato;
					pant.setText(mostrar);
				}
			}
			if (e.getActionCommand().equals("bBor")) {
				borrar();
			}
		}

	}

	// Evento para introducir la operacio por pantalla.
	public class Operaciones implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("bMas")) {
				suma();
			}
			if (e.getActionCommand().equals("bMenos")) {
				resta();
			}
			if (e.getActionCommand().equals("bMult")) {
				multiplica();
			}
			if (e.getActionCommand().equals("bDiv")) {		
				divide();
			}
			if (e.getActionCommand().equals("bRes")) {
				resultado();
			}
		}
	}
	//Metodo que recoge el primer numero y establece la operacion de suma
	public void suma(){
		mostrar = pant.getText();
		num1 = Double.parseDouble(mostrar);
		mostrar = "";
		op = '+';
		pant.setText(mostrar);
	}
	//Metodo que recoge el primer numero y establece la operacion de resta
	public void resta(){
		mostrar = pant.getText();
		num1 = Double.parseDouble(mostrar);
		mostrar = "";
		op = '-';
		pant.setText(mostrar);
	}
	//Metodo que recoge el primer numero y establece la operacion de multiplicacion
	public void multiplica(){
		mostrar = pant.getText();
		num1 = Double.parseDouble(mostrar);
		mostrar = "";
		op = '*';
		pant.setText(mostrar);
	}
	//Metodo que recoge el primer numero y establece la operacion de division
	public void divide(){
		mostrar = pant.getText();
		num1 = Double.parseDouble(mostrar);
		mostrar = "";
		op = '/';
		pant.setText(mostrar);
	}
	//Metodo que recoge el segundo numero y calcula los resultados.
	public void resultado(){
		mostrar = pant.getText();
		num2 = Double.parseDouble(mostrar);
		switch (op) {
		case '+':
			res = num1 + num2;
			entero();
			break;
		case '-':
			res = (num1 - num2);
			entero();
			break;
		case '*':
			res = (num1 * num2);
			entero();
			break;
		case '/':
			res = (num1 / num2);
			entero();
			break;
		}
		pant.setText(mostrar);
		pant.setEditable(false);
	}
	//Metodo para borrar el contenido de la caja de texto
	public void borrar(){
		mostrar = "";
		pant.setText(mostrar);
		pant.setEditable(true);
	}
	//Metodo para quitar los decimales cuando no son necesarios.
	public void entero(){
		if((res-Math.floor(res))==0){
			resu=(int) Math.floor(res);
			mostrar = String.valueOf(resu);
		}else{
			mostrar = String.valueOf(res);
		}
	}
}