
public class TiposDatos {
	
	public static void main(String[] args){
		
		int numAciertos = 3;
		int numIntentos = 6;
		int probabilidad = numAciertos/numIntentos;
		System.out.println(" P = " + probabilidad);
		
		double probabilidad2 = numAciertos/numIntentos;
		System.out.println(" P2 = " + probabilidad2);
		
		double probabilidad3 = (double) (numAciertos/numIntentos);
		System.out.println(" P3 = " + probabilidad3);
		
		double probabilidad4 = (double) numAciertos/numIntentos;
		System.out.println(" P4 = " + probabilidad4);
		
		double probabilidad5 = numAciertos/ (double) numIntentos;
		System.out.println(" P5 = " + probabilidad5);
	}
}
