package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calc {
	
	Calculadora c;
	
	@Before
	public void setUp(){
		c = new Calculadora();
		System.out.println("Before");
	}
	
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("BeforeClass");
	}
	
	@After
	public void after(){
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("AfterClass");
	}
	
	@Test
	public void sumarTest(){
		
		double valorEsperado = 4;
		double valorReal = c.sumar(2, 2);
		
		assertEquals(valorEsperado, valorReal,0);
		System.out.println("sum");
	}
	
	@Test
	public void restarTest(){
		
		double valorEsperado = 5;
		double valorReal = c.restar(10, 5);
		
		assertEquals(valorEsperado, valorReal,0);
		System.out.println("rest");
	}
	
	@Test
	public void dividirTest(){
		
		double valorEsperado = 2;
		double valorReal = c.dividir(6, 3);
		
		assertEquals(valorEsperado, valorReal, 0);
		System.out.println("div");
	}
	
	@Test
	public void multiplicarTest(){
		
		double valorEsperado = 18;
		double valorReal = c.multiplicar(9, 2);
		
		assertEquals(valorEsperado, valorReal, 0);
		System.out.println("mult");
	}

}
