import java.util.Scanner;

public class MayorOmenor {

	public static void main(String[] args) {
		
		
	//Leemos los n�meros
	Scanner tec = new Scanner(System.in);
	int n1, n2;
	
	System.out.println("Dame el primer n�mero: ");
	n1 = tec.nextInt();
	n2 = tec.nextInt();
	if(n1>n2){
		System.out.println(n1+" es mayor que " +n2);
	}else{
		System.out.println(n2+" es mayor que "+n1);
	}
}

}
