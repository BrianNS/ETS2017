import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
	
		double longitud, radio;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Radio: ");
		radio = sc.nextDouble();
		
		
		longitud = 2 * 3.1416 * +radio;
		
		System.out.println("Longitud: " +radio);
		sc.close();	
		
}
}