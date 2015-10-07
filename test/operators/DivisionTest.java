package operators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void testDivision() {
		double result = Division.division(1, 3);
		
		assertEquals(result, 0.33333, 0);
	}
	
	@Test
	public void testSixZero(){
		double result = Division.division(1, 3);
		assertNotEquals(result, 0.333333);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionByZero(){
		double result = Division.division(1, 0);
	}
	
	
	
}
