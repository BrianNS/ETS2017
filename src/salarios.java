import java.util.Scanner;

public class salarios {

	public static void main(String[] args){
		Scanner tec=new Scanner(System.in);
		System.out.println("Por favor, introduzca 10 salarios: ");
		
		int P=0;
		double S;
		double Suma=0;
		
		for(int i = 1; i<=10; i++){
			System.out.println("Salario " +i +": ");
			
			S=tec.nextDouble();
			if(S>1500){
				P++;
			Suma=Suma +S;
			
			}
		}
		System.out.println("La media de los salarios es de: " +Suma/10+" € de los cuales " +P+ " superan los 1500 €");
		tec.close();
		}
}
