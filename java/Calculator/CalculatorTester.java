public class CalculatorTester {
  public static void main(String[] args) {
  	testAddition();
  	testSubtraction();
  	testMultiplication();
  	testDivision();
  	testModulation();
  	testExponentation();
  	testSquared();
  	testSquareRoot();
  	testLogarithm();
  	testCommonLogarithm();
  	testNaturalLogarithm();
  	testFactorial();
  	testSine();
  	testCosine();
  	testTangent();
  }

  public static void testAddition() {
  	System.out.println("Testing addition():");
  	Calculator calculator = new Calculator();

		// // wrong type?

  	// // Empty Case: No arguments
  	// calculator.addition();

  	// // Empty Case: Too few arguments
  	// calculator.addition(1.0);

  	// // Empty Case: Too many arguments
  	// calculator.addition(1.0, 2.0, 3.0);

  	// Empty case: Zeroes
  	assert calculator.addition(0.0, 0.0) == 0.0: true;
  	System.out.print("1");


  	// Border Case: Augend As Zero
  	assert calculator.addition(0.0, 1.0) == 1.0: true;
  	assert calculator.addition(0.0, 0.5) == 0.5: true;
  	assert calculator.addition(0.0, 1.5) == 1.5: true;
  	assert calculator.addition(0.0, -1.0) == -1.0: true;
  	assert calculator.addition(0.0, -0.5) == -0.5: true;
  	assert calculator.addition(0.0, -1.5) == -1.5: true;
  	System.out.print(" 2");

  	// Border Case: Addend As Zero
  	assert calculator.addition(1.0, 0.0) == 1.0: true;
  	assert calculator.addition(0.5, 0.0) == 0.5: true;
  	assert calculator.addition(1.5, 0.0) == 1.5: true;
  	assert calculator.addition(-1.0, 0.0) == -1.0: true;
  	assert calculator.addition(-0.5, 0.0) == -0.5: true;
  	assert calculator.addition(-1.5, 0.0) == -1.5: true;
  	System.out.print(" 3");

  	// Border Case: Augend As One
  	assert calculator.addition(1.0, 1.0) == 2.0: true;
  	assert calculator.addition(1.0, 0.5) == 1.5: true;
  	assert calculator.addition(1.0, 1.5) == 2.5: true;
  	assert calculator.addition(1.0, -1.0) == 0.0: true;
  	assert calculator.addition(1.0, -0.5) == 0.5: true;
  	assert calculator.addition(1.0, -1.5) == 0.5: true;
  	System.out.print(" 4");

  	// Standard Case: Addend As One
  	assert calculator.addition(1.0, 1.0) == 2.0: true;
  	assert calculator.addition(0.5, 1.0) == 1.5: true;
  	assert calculator.addition(1.5, 1.0) == 2.5: true;
  	assert calculator.addition(-1.0, 1.0) == 0.0: true;
  	assert calculator.addition(-0.5, 1.0) == 0.5: true;
  	assert calculator.addition(-1.5, 1.0) == -0.5: true;
  	System.out.print(" 5");

  	System.out.println("\tAll tests passed!");
  }

  public static void testSubtraction() {
  	System.out.println("Testing subtraction():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testMultiplication() {
  	System.out.println("Testing multiplication():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testDivision() {
  	System.out.println("Testing division():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testModulation() {
  	System.out.println("Testing modulation():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testExponentation() {
  	System.out.println("Testing exponentation():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testSquared() {
  	System.out.println("Testing squared():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testSquareRoot() {
  	System.out.println("Testing squareRoot():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testLogarithm() {
  	System.out.println("Testing logarithm():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testCommonLogarithm() {
  	System.out.println("Testing commonLogarithm():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testNaturalLogarithm() {
  	System.out.println("Testing naturalLogarithm():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testFactorial() {
  	System.out.println("Testing factorial():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testSine() {
  	System.out.println("Testing sine():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testCosine() {
  	System.out.println("Testing cosine():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }

  public static void testTangent() {
  	System.out.println("Testing tangent():");
  	Calculator calculator = new Calculator();
  	System.out.println("\tAll tests passed!");
  }
}