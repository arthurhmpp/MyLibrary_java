package capitulo13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora c;
	int a, b, z;
	
	@BeforeEach
	public void iniciar() {
		c = new Calculadora();
		a = 10;
		b = 5;
		z = 0;
	}
	
	@Test
	@DisplayName("MULTIPLICANDO CONVENCIONAL")
	public void MultiplicarSimples() {
		assertEquals(5, c.multiplicar(a, b), "NÃO FOI COMO ESPERADO!!");
	}
	
	@RepeatedTest(10)
	public void MultiplicarZero() {
		assertEquals(0, c.multiplicar(a, z));
	}
}
