package operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void testAddition() {
		double result = Addition.addition(1, 2);
		
		assertEquals(result, 3, 0);
	}

}
