import java.util.Scanner;

public class SalarioM�nimo {

	public static void main(String[] args) {
		
		double s, Sub, salario;
		
		s = 655.20;
		System.out.println("El SMI actual es de: " +s+ "�");
		
		Sub = 655.20*0.25/100;
		salario = (s+Sub);
		
		System.out.println("El SMI para el a�o pr�ximo ser� de: " +salario+ "�");
	}
}
