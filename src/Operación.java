import java.util.Scanner;

public class Operación {

	public static void main(String[] args) {
		
	Scanner tec = new Scanner(System.in);
	int n1, n2, n3;
	System.out.println("Por favor, introduzca los dos números: ");
	n1 = tec.nextInt();
    n2 = tec.nextInt();
    
    System.out.println("Por favor, introduzca la operación que desea hacer siendo: 1=suma, 2=resta, 3=multiplicación, 4=división ");
    n3 = tec.nextInt();
    double resultado;
    
    if(n3==1) {    	   
    resultado = (n1+n2);
    System.out.println("El resultado de la suma es: "+resultado);
     
    }else{    	
    if(n3==2) {	    	    
    resultado = (n1-n2);
    System.out.println("El resultado de la resta es: "+resultado);
    
    }else{   	
    if(n3==3);	    	   	
    resultado = (n1*n2);
    System.out.println("El resultado de la multiplicación es: "+resultado);
        
    if(n3==4);       
    resultado = (n1/n2);
    System.out.println("El resultado de la división es: "+resultado);
        
    }
    }
	}
}  