/** 
 * Purpose: To create a calculator application that is equivelant to the google calculator
 * Author: Ian Christensen
 * Contact Info: igc2@students.calvin.edu
 * Date Created: 11/10/2018
 */

import java.io.*;

public class Calculator {

  /**
   * Calculates the summation of two numbers of type double and both prints and returns the result
   *
   * @param augend  The first operand of type double in the operation
   * @param addend  The second operand of type double in the operation
   * @return sum    The result of the operation
   * @post println  The result is printed to the console
   */
  public static double addition(double augend, double addend) {
    double summation = augend + addend;
    System.out.println(String.format("The summation of %f and %f is equal to %f", augend, addend, summation));
    return summation;
  }

  /**
   * Calculates the difference of two numbers of type double and both prints and returns the result
   *
   * @param minuend     The first operand of type double in the operation
   * @param subtrahend  The second operand of type double in the operation
   * @return difference The result of the operation
   * @post println      The result is printed to the console
   */
  public static double subtraction(double minuend, double subtrahend) {
    double difference = minuend - subtrahend;
    System.out.println(String.format("The difference of %f and %f is equal to %f", minuend, subtrahend, difference));
    return difference;
  }

  /**
   * Calculates the product of two numbers of type double and both prints and returns the result
   *
   * @param multiplicand  The first operand of type double in the operation
   * @param multiplier    The second operand of type double in the operation
   * @return product      The result of the operation
   * @post println        The result is printed to the console
   */
  public static double multiplication(double multiplicand, double multiplier) {
    double product = multiplicand * multiplier;
    System.out.println(String.format("The product of %f and %f is equal to %f", multiplicand, multiplier, product));
    return product;
  }

  /**
   * Calculates the quotient of two numbers of type double and both prints and returns the result
   *
   * @param dividend  The first operand of type double in the operation
   * @param divisor   The second operand of type double in the operation
   * @return quotient The result of the operation
   * @pre .equals(0)  The divisor must be a non-zero value
   * @post println    The result is printed to the console
   */
  public static double division(double dividend, double divisor) {
    if(divisor <= -0.000000000000000000001 && divisor >= 0.000000000000000000001) {
      double quotient = dividend / divisor;
      System.out.println(String.format("The quotient of %f and %f is equal to %f", dividend, divisor, quotient));
      return quotient;
    } else {
      System.out.println("The divisor is an invalid value:\nPlease enter a non-zero divisor.");
      return 0.0;
    }
  }

  /**
   * Calculates the remainder of two numbers of type double and both prints and returns the result
   *
   * @param dividend    The first operand of type double in the operation
   * @param divisor     The second operand of type double in the operation
   * @return remainder  The result of the operation
   * @post println      The result is printed to the console
   */
  public static double modulation(double dividend, double divisor) {
    if(divisor >= -0.000000000000000000001 && divisor <= 0.000000000000000000001) {
      System.out.println("The divisor is an invalid value:\nPlease enter a non-zero divisor.");
      return 0.0;
    } else {
      double remainder = dividend % divisor;
      System.out.println(String.format("The remainder of %f and %f is equal to %f", dividend, divisor, remainder));
      return remainder;
    }
  } // can you have a remainder when something is divided by zero???

  /**
   * Calculates the power of two numbers of type double and both prints and returns the result
   *
   * @param base      The first operand of type double in the operation
   * @param exponent  The second operand of type double in the operation
   * @return power    The result of the operation
   * @post println    The result is printed to the console
   */
  public static double exponentation(double base, double exponent) {
    double power = Math.pow(base, exponent);
    System.out.println(String.format("The power of %f raised to %f is equal to %f", base, exponent, power));
    return power;
  }

  public static double squared(double exponent) {
    double power = Math.pow(2, exponent);
    System.out.println(String.format("The power of %f squared is equal to %f", exponent, power));
    return power;
  }

  public static double squareRoot(double radicand) {
    double squareRoot = Math.sqrt(radicand);
    System.out.println(String.format("The square root of %f and %f is equal to %f", radicand, squareRoot));
    return squareRoot;
  }

  public static double logarithm(double base, double antilogarithm) {
    double logarithm = Math.log10(antilogarithm) / Math.log10(base);
    System.out.println(String.format("The base %f logarithm of %f is equal to %f", base, antilogarithm, logarithm));
    return logarithm;
  }

  public static double commonLogarithm(double antilogarithm) {
    double commonLogarithm = Math.log10(antilogarithm);
    System.out.println(String.format("The common logarithm of %f is equal to %f", antilogarithm, commonLogarithm));
    return commonLogarithm;
  }

  public static double naturalLogarithm(double antilogarithm) {
    double naturalLogarithm = Math.log10(antilogarithm) / Math.log10(Math.E);
    System.out.println(String.format("The natural logarithm of %f is equal to %f", antilogarithm, naturalLogarithm));
    return naturalLogarithm;
  }

  // public static double factorial(double operand) {
  //   double factorial = factorial(operand);
  //   return factorial;
  // }

  // public static double sine(double operand) {
  //   double sine = Math.sin(operand);
  //   return sine;
  // }

  // public static double cosine(double operand) {
  //   double cosine = Math.cos(operand);
  //   return cosine;
  // }

  // public static double tangent(double operand) {
  //   double tangent = Math.tan(operand);
  //   return tangent;
  // }

  public static void main(String[] args) {
    new Calculator();  
  }
}
