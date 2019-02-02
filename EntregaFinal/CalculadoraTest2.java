//package hoja2;
/*Martin Ortega 18020
Sara Zavala 18893
Algoritmos y Estructuras de datos
Pruebas Unitarias
CalculadoraTest2.java
*/
import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest2 {

	@Test
	public void TestMultiplicarr() {
		Calculadora test = new Calculadora();
		double resultado = test.multiplicar(1, 2);
		double esperado = 2;
		assertEquals(esperado,resultado);	
	}
	
	@Test
	public void TestDividir() {
		Calculadora test = new Calculadora();
		double resultado = test.dividir(6, 2);
		double esperado = 3;
		assertEquals(esperado,resultado);
		
		
	}
}
