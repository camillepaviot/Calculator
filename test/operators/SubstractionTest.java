package operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstractionTest {

	@Test
	public void test() {
		double result = Substraction.substraction(2, 1);
		
		assertEquals(result, 1, 0);
	}

}
