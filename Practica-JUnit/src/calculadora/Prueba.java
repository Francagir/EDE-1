package calculadora;

public class Prueba {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int opcion = 0;
		
		Calculadora c = new Calculadora();
		
		System.out.println("Elige la operaci�n que quieras realizar"
				+ "\n1. Sumar"
				+ "\n2. Restar"
				+ "\n3. Dividir"
				+ "\n4. Multiplicar");
		opcion = Entrada.entero();
		
		System.out.println("\nIntroduce el primer n�mero");
		a = Entrada.entero();
		
		System.out.println("\nIntroduce el segundo n�mero");
		b = Entrada.entero();
		
		switch(opcion){
		case 1: System.out.println("\nSuma: " + c.sumar(a, b)); break;
		case 2: System.out.println("\nResta: " + c.restar(a, b)); break;
		case 3: System.out.println("\nDivisi�n: " + c.dividir(a, b)); break;
		case 4: System.out.println("\nMultiplicaci�n: " + c.multiplicar(a, b)); break;
		default: System.out.println("\nN�mero no correcto, resultado default de la suma: " + c.sumar(a, b));
		}
		
	}

}
