import java.util.Scanner;

public class nºnegativo {
	
	public static void main(String[] args){
		boolean repetir = true; 		
		Scanner tec = new Scanner(System.in);
		int np=0;
		int n;
		
		while (repetir){
			System.out.println("Introduzca un número: ");
			
			n = tec.nextInt();						
			if (n > 0){	
				np++;
				System.out.println("Introduzca otro número: ");
			}else{
				System.out.println("Ha introducido " + np++ + " números positivos");
				repetir = false;			
		}												
			}			
			
			tec.close();
	}
			}
