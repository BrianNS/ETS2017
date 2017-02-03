import java.util.Scanner;

public class main {

	public static void main(String[] args){
		
		Monedas a = new Monedas();

		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad a cambiar: ");
		
		//Respuesta dentro de la misma llamada al metodo
		System.out.println("Los dolares que " + "le corresponde es: " +a.euroDolar(tec.nextDouble()));

		//respuesta separada en variables
		
		System.out.println("Introduzca la cantidad a cambiar: ");
		
		double resultado = a.dolarEuro(tec.nextDouble());
		
		System.out.println("Los euros a recibir son: " +resultado);
		
		//Vamos a cambiar la variable cambio
		
		System.out.println("Introduzca l base del cambio: ");
		
		Monedas m = new Monedas(tec.nextDouble());		
		System.out.println("El valor del cambio es: " +m.getCambio());
		
		System.out.println("Introduzca la cantidad a cambiar: ");
		
		double result = m.euroDolar(tec.nextDouble());
		System.out.println("Los dolares a recibir son: " +result);
		
		tec.close();
	}
}
