import java.util.Scanner;

public class Mayorde7nº {

	public static void main(String[] args) {
		int mayor=0, n=0;
		Scanner tec = new Scanner(System.in);
		
		for(int i = 1; i <= 7; i++){
		System.out.println("Introduzca el número: ");	
			n = tec.nextInt();
		if(n>mayor){
			mayor=n;
		}		
		}
		System.out.println("El mayor era: " +mayor);
		tec.close();
	}
}		