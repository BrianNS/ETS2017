import java.util.Scanner;

public class n�negativo {
	
	public static void main(String[] args){
		boolean repetir = true; 		
		Scanner tec = new Scanner(System.in);
		int np=0;
		int n;
		
		while (repetir){
			System.out.println("Introduzca un n�mero: ");
			
			n = tec.nextInt();						
			if (n > 0){	
				np++;
				System.out.println("Introduzca otro n�mero: ");
			}else{
				System.out.println("Ha introducido " + np++ + " n�meros positivos");
				repetir = false;			
		}												
			}			
			
			tec.close();
	}
			}
