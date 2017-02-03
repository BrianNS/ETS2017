import java.io.IOException;

import java.util.Scanner;

public class Modalidad {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Escriba la edad. ");
		Scanner tec = new Scanner(System.in);
		int n = tec.nextInt();
		
		
		System.out.println("Escriba su modalidad de acceso: \nA = Acceso directo, \nG = Grado medio, \nP = Prueba de acceso ");
		char c = (char) System.in.read();
		int asc_c = (int) c;
		
		if (asc_c == 65 && n < 18) {
			System.out.println("Pase por secretaría");
		}else{
		
		if(asc_c == 71 || asc_c == 80 && n >=18) {
			System.out.println("Solicite código en jefatura");
		}else{
			if (asc_c == 65 && n > 18) {	
			System.out.println("Las clases son en la R03, gracias");
			}else{
				if (asc_c != 65 || asc_c != 71 || asc_c != 80) {	
				System.out.println("No existe tal opción, inténtalo de nuevo");
		}
		}
		tec.close();
	}
}
}
}