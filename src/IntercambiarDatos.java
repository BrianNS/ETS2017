import java.util.Scanner;

public class IntercambiarDatos {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Introduzca el valor a: ");
		a = tec.nextInt();
		System.out.println("Introduzca el valor b: ");
		b = tec.nextInt();
		
		System.out.println("Valores iniciales: a = "+a+ " b = "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("valores intercambiados: a = "+a+ " b = "+b);
	}
}
