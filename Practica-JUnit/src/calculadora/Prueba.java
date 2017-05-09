package calculadora;

public class Prueba {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int opcion = 0;
		
		Calculadora c = new Calculadora();
		
		System.out.println("Elige la operación que quieras realizar"
				+ "\n1. Sumar"
				+ "\n2. Restar"
				+ "\n3. Dividir"
				+ "\n4. Multiplicar");
		opcion = Entrada.entero();
		
		System.out.println("\nIntroduce el primer número");
		a = Entrada.entero();
		
		System.out.println("\nIntroduce el segundo número");
		b = Entrada.entero();
		
		switch(opcion){
		case 1: System.out.println("\nSuma: " + c.sumar(a, b)); break;
		case 2: System.out.println("\nResta: " + c.restar(a, b)); break;
		case 3: System.out.println("\nDivisión: " + c.dividir(a, b)); break;
		case 4: System.out.println("\nMultiplicación: " + c.multiplicar(a, b)); break;
		default: System.out.println("\nNúmero no correcto, resultado default de la suma: " + c.sumar(a, b));
		}
		
	}

}
