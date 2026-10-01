package se.unibg.it.calculator;

public class Calculator {

	static int sum(int x, int y, int w) {
		return x + y;
	}
	// question: what is the product of two numbers?
	static int product(int x, int y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		return x * y;
	}
	// divide two numbers
	static double divide(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		return (double) x / y;
	}
}
