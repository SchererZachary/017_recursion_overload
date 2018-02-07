package pkg017_recursion_overload;

/**
 * @version 1.0
 * @author zacharycs
 * @param none
 * @return none
 * This method starts the program and sets up the basic varibles
 */
public class runner {
	public static void main(String[] args) {
		int n = 10;
		int nBeta = 0;
		recurse(n);
		System.out.println();
		recurseAddUp(nBeta);
		System.out.println();
		int startValue = 0;
		int stopValue = 50;
		recurseEvens(startValue, stopValue);
		recurseEvens(startValue, stopValue);
	}
	/**
	 * @author zacharycs
	 * @version 1.0
	 * @param n
	 * @return none
	 * This function uses recursion, the function calling itself, to count down until 0
	 */
	private static void recurse(int n) {
		System.out.println("We can run recurse " + n + " more times");
		n--;
		if (n >= 0) {
			recurse(n);
		}

	}
	/**
	 * @author zacharycs
	 * @version 1.0
	 * @param nBeta
	 * @return none
	 * This function uses recursion to count up by using the same function
	 */
	private static void recurseAddUp(int nBeta) {
		System.out.println("We have run recurse " + nBeta + " times");
		nBeta++;
		if (nBeta <= 10) {
			recurseAddUp(nBeta);
		}

	}
	/**
	 * Display even number from startValue to stopValue using recursion
	 * @author zacharycs
	 * @param startValue
	 * @param stopvalue
	 * @version 1.0
	 * @return null
	 * 
	 */
	
	// overloading is when methods have the same name but have different parms or input type
	//creaate overload method
	
	private static void recurseEvens(int startValue, int stopValue) {
		startValue++;
		if (startValue % 2 == 0 && startValue != stopValue) {
			System.out.println(startValue + " is an even number");
		}
		
		if (startValue < stopValue) {
			recurseEvens(startValue, stopValue);
		}
	}
}// end of runner
