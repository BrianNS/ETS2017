import java.util.Scanner;

public class Palíndromo {

	private String cadena;
	
	public Palíndromo(String a){
		this.cadena = a;
	}
	
	public String palín(){
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
		
		Palíndromo p=new Palíndromo(pal);
		String resultado=p.palín();
		System.out.println(resultado);
		
		tec.close();
	}
}
