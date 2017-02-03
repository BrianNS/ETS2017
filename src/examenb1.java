import java.util.Scanner;

public class examenb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario=0;
		double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
		double media = 0;
		int num_introducidos = 0;
        do{
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Introduce un salario: ");	
	        salario=sc.nextDouble();
	        if(salario >= 655.20){
		        media+=salario;
		        if(salario>=mayor && salario >= 0){
		        	mayor = salario;
		        }
	        	if(salario<=menor && salario >= 0){
	        		menor = salario;
	        	}
		        num_introducidos++;
	        }
        	
        
        }while(salario>=655.20);
        System.out.println("Has introducido "+num_introducidos+" salarios");
    	System.out.println("La suma de los salarios :"+media);
    	
		System.out.println("media");
		media=(media/num_introducidos);
		System.out.println("La media de  los salarios:"+ media);	
			
        System.out.println("El mayor número introducido es "+mayor);
        System.out.println("El menor número introducido es "+menor);
        
        
        
        
	
	}

}
