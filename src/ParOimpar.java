import java.util.Scanner;

public class ParOimpar {

	public static void main(String[] args) {
		
	Scanner tec = new Scanner(System.in);
	System.out.println("Ingresa un número: ");
	int n = tec.nextInt();
    if(n%2==0){
		System.out.println(n+" es par");
    }else{	
		System.out.println(n+" es impar");
    	}
	}
}