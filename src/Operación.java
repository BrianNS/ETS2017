import java.util.Scanner;

public class Operaci�n {

	public static void main(String[] args) {
		
	Scanner tec = new Scanner(System.in);
	int n1, n2, n3;
	System.out.println("Por favor, introduzca los dos n�meros: ");
	n1 = tec.nextInt();
    n2 = tec.nextInt();
    
    System.out.println("Por favor, introduzca la operaci�n que desea hacer siendo: 1=suma, 2=resta, 3=multiplicaci�n, 4=divisi�n ");
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
    System.out.println("El resultado de la multiplicaci�n es: "+resultado);
        
    if(n3==4);       
    resultado = (n1/n2);
    System.out.println("El resultado de la divisi�n es: "+resultado);
        
    }
    }
	}
}  