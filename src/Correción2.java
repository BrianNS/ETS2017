import java.util.Scanner;

public class Correción2 {

	public static void main (String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int edad;
		System.out.println("Indique la edad: ");
		edad = teclado.nextInt();
		
		if(edad <=18){
			System.out.println("Es menor de edad");
		}else{
			System.out.println("Es mayor de edad");
		}
		teclado.close();
	}
}
