import java.io.IOException;
import java.util.Scanner;

public class C�digoASCII {

	public static void main(String[] args) throws IOException {
		int n;
		
		System.out.println("Escriba un n�mero entero: ");
		Scanner tec = new Scanner(System.in);
		n = tec.nextInt();
		char Asc = (char) n;
		
		System.out.println("El car�cter asociado al n�mero entero es: " + Asc);
		tec.close();
	}
}