import java.util.Scanner;

public class Años {

	public static void main(String[] args) {
		
	Scanner tec;
	
	tec = new Scanner(System.in);
	System.out.println("Por favor, introduce el año actual: ");
	int AñoAct = tec.nextInt();
	System.out.println("Por favor, introduce el año de naciemiento: ");
	int	AñoNac = tec.nextInt();
	
	int edad =(AñoAct-AñoNac);
	
	System.out.println("Su edad es: " +edad);	
	
}
}