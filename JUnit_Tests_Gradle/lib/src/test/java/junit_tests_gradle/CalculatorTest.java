package junit_tests_gradle;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.IllegalArgumentException;

public class CalculatorTest {

	private Calculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	void positiveSum_twoPositiveInteger_returnSum() {
		int sum = calculator.positiveSum(3, 5);
		assertTrue(sum > 0);
		assertEquals(8, sum);
		assertFalse(sum <= 0);
		assertNotNull(sum);
	}
	
	@Test
	void positiveSum_negativeInteger_throwsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.positiveSum(-4, 5);
		});
	}
}
