import java.util.Scanner;

public class Pal�ndromo {

	private String cadena;
	
	public Pal�ndromo(String a){
		this.cadena = a;
	}
	
	public String pal�n(){
		String girar = "";
		for(int i = cadena.length() - 1; i>= 0; i--){
			girar = girar + cadena.charAt(i);
		}
		return cadena + girar;
	}
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca la palabra: ");
		String pal = tec.nextLine();
		
		Pal�ndromo p=new Pal�ndromo(pal);
		String resultado=p.pal�n();
		System.out.println(resultado);
		
		tec.close();
	}
}
