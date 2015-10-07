package operators;

public class Modulo {
	/**
	 * function modulo: divide two doubles and show modulo with 5 digits after coma.
	 * @param a: first number of calcul
	 * @param b: second number of calcul
	 * @return double a%b: result
	 * @throws ArithmeticException if modulo by zero
	 */
	public static double modulo(double a, double b){
		double result = 0;
		if(b != 0) {
			result = a%b;
			result = (double) Math.round(result*100000)/100000;
			
		} else {
			throw new ArithmeticException("Modulo by zero not authorized");
		}
		return result;
		
	}
}
