import java.io.IOException;
import java.util.Scanner;
public class prueba {
	public static void main(String[] args) throws IOException {
		System.out.println("Escriba un carácter: ");
		char c = (char) System.in.read();
		int asc_c = (int) c;
		
		System.out.print("Escriba un entero: ");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		
		if (asc_c != 90 && n < 5) {
			System.out.println("Entraste en la primera condición");
		}else{
			if (asc_c == 65 || n == 0) {
				System.out.println("Entraste en la segunda condición");
			}else{
				System.out.println("No coincide ninguna condición");
			}
		}
		teclado.close();
	}
}