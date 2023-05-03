package junit_tests_gradle;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Disabled;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyTests {

	@BeforeAll
	void runBeforeAll() {
		System.out.println("run once before all tests");
	}
	
	@BeforeEach
	void runBeforeEach() {
		System.out.println("before each test method");
	}
	
	@Test
	void firstTest() {
		System.out.println("hello world in firstTest() method");
	}
	
	@Disabled
	@Test
	void secondTest() {
		System.out.println("hello world in secondTest() method");
	}
	
	@AfterEach
	void runAfterEach() {
		System.out.println("after each test method");
	}
	
	@AfterAll
	void runAfterAll() {
		System.out.println("run once after all tests");
	}
	
}
