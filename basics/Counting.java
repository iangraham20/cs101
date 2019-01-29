/*
 *
 *
 *
 */

import java.util.Scanner;

public class Counting {

 /**
  *
  *
  *
  */
	public static void forIfElse() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i + " is divisable by both 2 and 3");
			} else if (i % 2 == 0) {
				System.out.println(i + " is divisable by 2");
			} else if (i % 3 == 0) {
				System.out.println(i + " is divisable by 3");
			} else {
				System.out.println(i + " is not divisable by 2 or 3");
			}
		}
	}

 /**
  *
  *
  *
  */
	public static void forSwitchCase() {
		for (int i = 1; i <= 6; i++) {
			switch (i) {
				case 0:
					System.out.println(i + " is divisable by both 2 and 3");
					break;
				case 2:
					System.out.println(i + " is divisable by 2");
					break;
				case 3:
					System.out.println(i + " is divisable by 3");
					break;
				case 6:
					System.out.println(i + " is divisable by both 2 and 3");
					break;
					// etc.
				default:
					System.out.println(i + " is not divisable by 2 or 3");
					break;
			}
		}
	}

 /**
  *
  *
  *
  */
	public static void whileIfElse(int i) {
		while (i <= 100) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i + " is divisable by both 2 and 3");
			} else if (i % 2 == 0) {
				System.out.println(i + " is divisable by 2");
			} else if (i % 3 == 0) {
				System.out.println(i + " is divisable by 3");
			} else {
				System.out.println(i + " is not divisable by 2 or 3");
			}
			i++;
		}
	}

 /**
  *
  *
  *
  */
	public static void whileSwitchCase(int i) {
		while (i <= 100) {
			switch (i) {
				case 0:
					System.out.println(i + " is divisable by both 2 and 3");
					break;
				case 2:
					System.out.println(i + " is divisable by 2");
					break;
				case 3:
					System.out.println(i + " is divisable by 3");
					break;
				case 6:
					System.out.println(i + " is divisable by both 2 and 3");
					break;
					// etc.
				case 7:
					return;
				default:
					System.out.println(i + " is not divisable by 2 or 3");
					break;
			}
			i++;
		}
	}

 /**
  *
  *
  *
  */
	public static void doWhileIfElse() {
		do {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i + " is divisable by both 2 and 3");
			} else if (i % 2 == 0) {
				System.out.println(i + " is divisable by 2");
			} else if (i % 3 == 0) {
				System.out.println(i + " is divisable by 3");
			} else {
				System.out.println(i + " is not divisable by 2 or 3");
			}
			i++;
		} while (i <= 100);
	}

 /**
  *
  *
  *
  */
	public static void doWhileSwitchCase() {
		do {
			switch (i) {
				case 0:
					System.out.println(i + " is divisable by both 2 and 3");
					break;
				case 2:
					System.out.println(i + " is divisable by 2");
					break;
				case 3:
					System.out.println(i + " is divisable by 3");
					break;
				case 6:
					System.out.println(i + " is divisable by both 2 and 3");
					break;
					// etc.
				case 7:
					return;
				default:
					System.out.println(i + " is not divisable by 2 or 3");
					break;
			}
			i++;
		} while (i <= 100)
	}

 /**
  *
  *
  *
  */
	public static void recursionIfElse(int i) {
		if (i > 100) {
			return;
		} else if (i % 2 == 0 && i % 3 == 0) {
			System.out.println(i + " is divisable by both 2 and 3");
		} else if (i % 2 == 0) {
			System.out.println(i + " is divisable by 2");
		} else if (i % 3 == 0) {
			System.out.println(i + " is divisable by 3");
		} else {
			System.out.println(i + " is not divisable by 2 or 3");
		}
		recursionIfElse(i + 1);
	}

 /**
  *
  *
  *
  */
	public static void recursionSwitchCase(int i) {
		switch (i) {
			case 0:
				System.out.println(i + " is divisable by both 2 and 3");
				break;
			case 2:
				System.out.println(i + " is divisable by 2");
				break;
			case 3:
				System.out.println(i + " is divisable by 3");
				break;
			case 6:
				System.out.println(i + " is divisable by both 2 and 3");
				break;
				// etc.
			case 7:
				return;
			default:
				System.out.println(i + " is not divisable by 2 or 3");
				break;
		}
		recursionSwitchCase(i + 1);
	}

 /**
  *
  *
  *
  */
	public static void sequential() {
		System.out.println("0 is divisable by both 2 and 3");
		System.out.println("1 is not divisable by 2 or 3");
		System.out.println("2 is divisable by 2");
		System.out.println("3 is divisable by 3");
		System.out.println("4 is divisable by 2");
		System.out.println("5 is not divisable by 2 or 3");
		System.out.println("6 is divisable by both 2 and 3");
		// etc.
	}

 /**
  *
  *
  *
  */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a choice: ");
		int choice = reader.nextInt();

		switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				forIfElse();
				System.exit(0);
			case 2:
				forSwitchCase();
				System.exit(0);
			case 3:
				whileIfElse(1);
				System.exit(0);
			case 4:
				whileSwitchCase(1);
				System.exit(0);
			case 5:
				doWhileIfElse();
				System.exit(0);
			case 6:
				doWhileSwitchCase();
				System.exit(0);
			case 7:
				recursionIfElse(1);
				System.exit(0);
			case 8:
				recursionSwitchCase(1);
				System.exit(0);
			case 9:
				sequential();
			default:
				System.exit(0);
		}

	reader.close();
	}
}
