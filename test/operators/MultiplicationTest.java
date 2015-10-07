package operators;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void testMultiplication() {
		double result = Multiplication.multiplication(1, 2);
		
		assertEquals(result, 2, 0);
	}

}
