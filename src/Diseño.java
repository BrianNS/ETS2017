public class Diseño {
	private int a;
	private int b;
	private int c;
	
	public Diseño (int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int máximo(){
		if (c > a && c > b);
		return c;
	}
	public int máximodoble(){
		if (a > b || a > c);
		return a;
	}
	public int mínimo(){
		if (b < a && b < c);
		return b;
		}
	public int orden(){
		return c;
	}
	public int media(){
		return (a+b+c)/3;
	}	
}