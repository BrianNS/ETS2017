import java.util.Scanner;

public class Energía {

	public static void main(String[] args){
		Scanner tec=new Scanner(System.in);
		int N, Cont=0;
		double ContA=0, ContB=0, ContC=0, ContN=0;
		double PorcentajeA, PorcentajeB, PorcentajeC, PorcentajeN;
		
		
			System.out.println("Introduzca una categoría energética de la casa "
			+ " siendo: \n1=>A. \n2=>B. \n3=>C. "
			+ "\n4=>Vivienda que no tiene registro. \n5=>Salir de la aplicación."
			+ "\n Opción: ");
			
			boolean repetir=true;
			
			do{
			
			N=tec.nextInt();
			Cont++;
			
			switch (N){
			case 1:
				ContA++;
				break;
			case 2:
				ContB++;
				break;
			case 3:
				ContC++;
				break;
			case 4:
				ContN++;
				break;
			case 5:
				PorcentajeA=(ContA/Cont)*100;
				PorcentajeB=(ContB/Cont)*100;
				PorcentajeC=(ContC/Cont)*100;
				PorcentajeN=(ContN/Cont)*100;
				
				System.out.println("Se ha visitado un total de " +Cont + " viviendas, de las cuales " +ContA +
				" Cumple el certificado A, " +ContB + " con el certificado B y " +ContC + " con el certificado C"
				+ "\n\n Además, " +ContN + " no tiene/n registro");
				System.out.println("Los porcentajes de cada tipo son: \n "
						+PorcentajeA + " % en viviendas con certificado A, \n "
						+PorcentajeB + " % en viviendas con certificado B, \n "
						+PorcentajeC + " % en viviendas con certificado C y \n "
						+PorcentajeN + " % en viviendas sin estudio energético.");
				repetir=false;
				break;
			}
		}while(repetir);
		tec.close();
	}
}
