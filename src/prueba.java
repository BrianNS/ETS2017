import java.io.IOException;
import java.util.Scanner;
public class prueba {
	public static void main(String[] args) throws IOException {
		System.out.println("Escriba un car�cter: ");
		char c = (char) System.in.read();
		int asc_c = (int) c;
		
		System.out.print("Escriba un entero: ");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		
		if (asc_c != 90 && n < 5) {
			System.out.println("Entraste en la primera condici�n");
		}else{
			if (asc_c == 65 || n == 0) {
				System.out.println("Entraste en la segunda condici�n");
			}else{
				System.out.println("No coincide ninguna condici�n");
			}
		}
		teclado.close();
	}
}