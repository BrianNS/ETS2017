import java.util.Scanner;

public class A�oBisiesto {

	public static void main(String[] args) {
		
	Scanner tec;
	int N;
	
	tec = new Scanner(System.in);
	System.out.println("Por favor, introduce el a�o: ");
	N = tec.nextInt();
	if (N%4==0){
		
	    System.out.println(N+" es bisiesto");	
	}else{
				
		System.out.println(N+" no es bisiesto");	
	
	if (N%400==0){
	
		System.out.println(N+" es bisiesto");	
	}else{
		
	System.out.println(N+" no es bisiesto");
		
	}
	}
	}		
}