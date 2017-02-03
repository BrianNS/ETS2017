import java.util.Scanner;

public class examen1 {

	public static void main(String[] args){
		int numero = 0;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		do{
			Scanner tec = new Scanner(System.in);
			System.out.println("Introduce el número: ");
			numero = tec.nextInt();
			if(numero>=mayor && numero >= 0){
				mayor = numero;	
			}
			if(numero<=menor && numero >= 0){
				menor = numero;
			}
			
		}while(numero>=0);
		System.out.println("El mayor número introducido es: "+mayor);
		System.out.println("El menor número introducido es: "+menor);
		System.out.println("El menor número introducido es: "+(mayor+menor));
	}
}
