import javax.swing.JOptionPane;

public class Velocidad {

	public static void main(String[] args) {
		double T, Tih, Tim, Tis, Tfh, Tfm, Tfs,V;
		double Distancia = 3.2;
		boolean repetir = true;
		do {

			JOptionPane.showMessageDialog(null,
					"A continuación, introduzca la hora, los minutos y los segundos en paneles distintos");
			Tih = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la hora a la que entró al tunel en formato de 24h: "));
			if (Tih < 0 || Tih > 23) {
				JOptionPane.showMessageDialog(null, "ERROR, tiempo no válido TE DIJE 24H!!!.");
				System.exit(0);
				repetir=false;
			}
			Tim = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los minutos a los que entró al tunel en formato de 60min: "));
			if (Tim < 0 || Tim > 59) {
				JOptionPane.showMessageDialog(null, "ERROR, tiempo no válido TE DIJE MÁXIMO 60MIN.");
				System.exit(0);
				repetir=false;
			}
			Tis = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los segundos a los que entró al tunel en formato de 60seg: "));
			if (Tis < 0 || Tim > 59) {
				JOptionPane.showMessageDialog(null, "ERROR, tiempo no válido TE DIJE MÁXIMO 60SEG.");
				System.exit(0);
				repetir=false;
			}
			Tfh = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la hora a la que salió del túnel: "));
			if (Tfh < 0 || Tfh > 23) {
				JOptionPane.showMessageDialog(null, "ERROR, tiempo no válido TE DIJE 24H!!!.");
				System.exit(0);
				repetir=false;
			}
			Tfm = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los minutos a los que salió del túnel: "));
			if (Tfm < 0 || Tfm > 59) {
				JOptionPane.showMessageDialog(null, "ERROR, tiempo no válido TE DIJE MÁXIMO 60MIN.");
				System.exit(0);
				repetir=false;
			}
			Tfs = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los segundos a los que salió del túnel: "));
			if (Tfs < 0 || Tfs > 59) {
				JOptionPane.showMessageDialog(null, "ERROR, tiempo no válido TE DIJE MÁXIMO 60SEG.");
				System.exit(0);
				repetir=false;
			}

			T = (Tfh - Tih) + (Tfm - Tim) / 60 + (Tfs - Tis) / 3600;

			V = (int)(Distancia/T);
			
			if (V > 80) {
				JOptionPane.showMessageDialog(null, "Supera la velocidad, que es: " + V + " Km/h");
			} else {
				JOptionPane.showMessageDialog(null, "La velocidad es de: " + V + "Km/h");
			}
			int elec=JOptionPane.showConfirmDialog(null, "¿Desea calcular otra velocidad?");
			switch (elec) {
			case 0:
				repetir=true;
				break;
			case 1:
				JOptionPane.showMessageDialog(null,"Gracias por usar nuestro servicio");
				repetir = false;
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null,"Gracias por usar nuestro servicio");
				repetir = false;
				break;
			}
		} while (repetir);
	}
}
