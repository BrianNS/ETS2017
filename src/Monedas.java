
public class Monedas {

	double cambio = 1.09;
	
	public Monedas(){
		
	}
	
	public Monedas(double cambio){
		this.cambio = cambio;
	}
	
	public double dolarEuro(double n){
		double result = 0;
		result = n/cambio;
		return result;
	}
	
	public double euroDolar(double n){
		double result = 0;
		result = n*cambio;
		return result;
	}
	
	//getter and setters
	public double getCambio(){
		return cambio;
	}
	public void setCambio(double cambio){
		this.cambio = cambio;
	}
}
