package junit_tests_gradle;



public class Calculator {

	public int positiveSum(int first, int second) {
		
		if (first > 0 && second > 0)
			return first + second;
		else
			throw new IllegalArgumentException("At least one parameter is not a positive integer");
		
	}
	
}
