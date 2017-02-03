import java.util.Scanner;

public class media {

	
	public static void main(String[] args) {
		
		//Declaramos variables
		int n1,n2,n3;
		Scanner tec;

		//leemos datos usuario
		tec = new Scanner(System.in);
		System.out.println("Por favor, introduce las notas: ");
		System.out.print("Nota1: ");
		n1= tec.nextInt();
		System.out.print("\nNota2: ");
		n2 = tec.nextInt();
		System.out.print("\nNota3 ");
		n3 = tec.nextInt();
		
		//Calculamos
		double media=(n1+n2+n3)/3;
		
		//Mostramos por pantalla
		System.out.println("La nota media es: " + media);
	}
}
