package operators;

import static org.junit.Assert.*;
import org.junit.Test;

public class ModuloTest {

	@Test
	public void testModulo() {
		double result = Modulo.modulo(5, 2);		
		assertEquals(result, 1, 0);
	}
	
	@Test
	public void testSixZero(){
		double result = Modulo.modulo(1, 3);
		assertNotEquals(result, 0.333333);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testModuloByZero(){
		double result = Modulo.modulo(1, 0);
	}
}
