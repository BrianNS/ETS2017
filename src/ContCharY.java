import java.io.IOException;
import java.util.Scanner;

public class ContCharY {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Introduzca caracteres siendo de 0 para parar de introducir: ");
		boolean repetir = true;
		Scanner tec = new Scanner(System.in);
		
		int ContY = 0;
		
		while(repetir){
			char c = (char) System.in.read();
			int asc_c = (int) c;
			
			if(asc_c == 89 || asc_c == 121){
				ContY++;
			}
			if(asc_c == 48){
				System.out.println("Ha introducido el carácter 'Y' " +ContY +" veces");
				repetir = false;
			}
		}
		tec.close();
	}
}
