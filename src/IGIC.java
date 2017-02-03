import java.util.Scanner;

public class IGIC {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int n1;
		
	System.out.println("Por favor, introduzca el importe del producto: ");	
	n1 = tec.nextInt();
	double p;
	double igic;
	
	igic=n1*0.07;
	p = n1+ igic;
	
	System.out.println("El resultado del importe con el 7% del IGIC es: "+p);
		
}
}