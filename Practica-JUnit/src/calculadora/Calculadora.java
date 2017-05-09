package calculadora;

public class Calculadora {

	public double sumar(int n, int m){
		
		int result = n + m;
		
		return result;
		
	}
	
	public double restar(int n, int m){
		
		int result = n - m;
		
		return result;
	}
	
	public double dividir(int n, int m){
		
		double result = n/m;
		
		return result;
	}
	
	public double multiplicar(int n, int m){
		
		int result = n*m;
		
		return result;
	}
	
	public double potencia(int n, int m){
		double result = Math.pow(n, m);
		
		return result;
	}
}
