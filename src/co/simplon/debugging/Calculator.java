package co.simplon.debugging;

public class Calculator {

    public int add(int a, int b) {
	int result = a + b;
	return result;
    }

    public int subtract(int a, int b) {
	int result = a - b;
	return result;
    }

    public int division(int a, int b) {
	int result = a / b;
	return result;
    }

    public int addArray(int[] numbers) {
	int result = 0;
	for (int i = 0; i < numbers.length; i++) {
	    int tmp_number = numbers[i];
	    result += tmp_number;
	}
	return result;
    }

    public static void main(String[] args) {
	Calculator calc = new Calculator();
	int num1 = 15;
	int num2 = 5;
	int num3 = 0;
	int[] numbers = { 1, 2, 3, 4, 5 };

	int sum = calc.add(num1, num2);
	System.out.println("Sum: " + sum);

	int difference = calc.subtract(num1, num2);
	System.out.println("Difference: " + difference);

	int sumArray = calc.addArray(numbers);
	System.out.println(
		"Sum of array numbers: " + sumArray);

	int division = calc.division(num1, num3);
	System.out.println("Division: " + division);

    }

}
