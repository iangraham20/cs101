/**
 *
 *
 *
 *
 *
 */

// TODO: work with an array or something similar

import java.util.Scanner;

public class Example {

 /**
  *
  *
  *
  */
	public static void ForLoop(int end) {
		int[] values = new int[end];
		for (int i = 0; i < end; i++) {
			System.out.print(i + " ");
			values[i] = i;
		}
		System.out.println("\nThere are " + values.length + " values in the array");
	}

 /**
  *
  *
  *
  */
	public static void WhileLoop(int end) {
		int i = 0;
		while (i <= end) {
			System.out.print(i + " ");
			i++;
		}
	}

 /**
  *
  *
  *
  */
	public static void DoLoop(int end) {
		int i = 0;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= end);
	}

 /**
  *
  *
  *
  */
	public static void Recursion(int end, int i) {
		if (i < end) {
			System.out.print(i + " ");
			Recursion(end, i + 1);
		} else if (i == end) {
			System.out.println("\nThe final number is: " + i);
			Recursion(end, i + 1);
		} else {
			return;
		}
	}

 /**
  *
  *
  *
  */
	public static void main(String[] args) {
		System.out.println("Enter a number to make a selection from the list:\n0. Exit\n1. For Loop\n2. While Loop\n3. Do Loop\n4. Recursion");

		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();

		if (number == 0) {
			System.exit(0);
		}

		System.out.println("Enter the number of iteration you would like to run");
		int end = reader.nextInt();

		switch (number) {
			case 1:
				ForLoop(end);
				break;
			case 2:
				WhileLoop(end);
				break;
			case 3:
				DoLoop(end);
				break;
			case 4:
				Recursion(end, 0);
				break;
			default:
				System.out.println("Invalid choice!");
		}

		reader.close();
		System.exit(0);
	}
}
