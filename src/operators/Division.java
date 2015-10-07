package operators;

public class Division {
	/**
	 * function division: division two doubles and show result with 5 digits after coma.
	 * @param a: first number of calcul
	 * @param b: second number of calcul
	 * @return double a/b: result
	 * @throws ArithmeticException if division by zero
	 */
	public static double division(double a, double b){
		double result = 0;
		if(b != 0) {
			result = a/b;
			result = (double) Math.round(result*100000)/100000;
			
		} else {
			throw new ArithmeticException("division by zero not authorized");
		}
		return result;
		
	}
}
