import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		
		
	//Leemos el número de horas trabajadas
	int n;
	Scanner tec;
	
	tec = new Scanner(System.in);
	System.out.println("Por favor, introduzca un valor ");
	n= tec.nextInt();
	
	//Calculamos
	double sueldo=(n*15);
	
	//Mostramos el sueldo
	System.out.println("El sueldo del trabajador es: " + sueldo);
		
}

}