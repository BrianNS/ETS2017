import java.util.Scanner;

public class A�os {

	public static void main(String[] args) {
		
	Scanner tec;
	
	tec = new Scanner(System.in);
	System.out.println("Por favor, introduce el a�o actual: ");
	int A�oAct = tec.nextInt();
	System.out.println("Por favor, introduce el a�o de naciemiento: ");
	int	A�oNac = tec.nextInt();
	
	int edad =(A�oAct-A�oNac);
	
	System.out.println("Su edad es: " +edad);	
	
}
}