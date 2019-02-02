//package hoja2;

//package hoja2;
/*Martin Ortega 18020
Sara Zavala 18893
Algoritmos y Estructuras de datos
Pruebas Unitarias
CalculadoraTest.java
*/
import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	

	
	@Test
	public void TestSumar() {
		Calculadora test = new Calculadora();
		double resultado = test.sumar(1, 2);
		double esperado = 3;
		assertEquals(esperado,resultado);	
	}
	
	@Test
	public void TestRestar() {
		Calculadora test = new Calculadora();
		double resultado = test.restar(5, 1);
		double esperado = 4;
		assertEquals(esperado,resultado);
		
		
	}
	
	

}
