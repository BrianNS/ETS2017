import java.util.Scanner;

public class sumaN�introducidos {

	public static void main(String[] args){
		boolean repetir =true;
		int np=0;
		int num;
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Ingrese un n�mero: ");
		while(repetir){
		num = tec.nextInt();
			
				num = tec.nextInt();
				np =num/2;
				System.out.println("La suma de los n�meros de ingreso es: "+np);
				if(num==5){
					repetir = false;
				}				
		}
		
		}
		
		}
	