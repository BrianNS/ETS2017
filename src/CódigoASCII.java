import java.io.IOException;
import java.util.Scanner;

public class CódigoASCII {

	public static void main(String[] args) throws IOException {
		int n;
		
		System.out.println("Escriba un número entero: ");
		Scanner tec = new Scanner(System.in);
		n = tec.nextInt();
		char Asc = (char) n;
		
		System.out.println("El carácter asociado al número entero es: " + Asc);
		tec.close();
	}
}