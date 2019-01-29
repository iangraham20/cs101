/**
 *
 *
 *
 *
 *
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator {

	private JFrame frame = new JFrame("Calculator");

	private JTextArea txtScreen = new JTextArea();

	// Calculation Variables:
	String strNum1 = "";
	String strNum2 = "";
	String[] statement;
	int num1 = 0;
	int num2 = 0;
	int totalVal = 0;
	String strTotal;

	// Number Buttons:
	private JButton button0 = new JButton("0");
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");

	// Operator Buttons:
	private JButton buttonAddition = new JButton("+");
	private JButton buttonSubtraction = new JButton("-");
	private JButton buttonMultiplication = new JButton("\u00D7");
	private JButton buttonDivision = new JButton("\u00F7");
	private JButton buttonEquals = new JButton("=");
	private JButton buttonDecimalPoint = new JButton(".");
	private JButton buttonLeftParentheses = new JButton("(");
	private JButton buttonRightParentheses = new JButton(")");
	private JButton buttonAllClear = new JButton("AC");
	private JButton buttonPercentage = new JButton("%");

	public Calculator() {
		// Frame Attributes:
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(435, 400);
		frame.setResizable(false);
		frame.setLayout(null);

		// txtScreen Attributes:
		txtScreen.setSize(415, 50);
		txtScreen.setLocation(10, 10);
		txtScreen.setEditable(false);

		// button0:
		button0.setSize(100, 50);
		button0.setLocation(10, 300);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("0");
			}
		});

		// buttonDecimalPoint:
		buttonDecimalPoint.setSize(100, 50);
		buttonDecimalPoint.setLocation(115, 300);
		buttonDecimalPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append(".");
			}
		});

		// buttonEquals:
		buttonEquals.setSize(100, 50);
		buttonEquals.setLocation(220, 300);
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				if (txtScreen.getText().contains("+")) {
					statement = txtScreen.getText().split("\\+");
					strNum1 = statement[0];
					strNum2 = statement[1];
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					totalVal = num1 + num2;
					strTotal = Integer.toString(totalVal);
					txtScreen.setText(strTotal);
				} else if (txtScreen.getText().contains("-")) {
					statement = txtScreen.getText().split("\\-");
					strNum1 = statement[0];
					strNum2 = statement[1];
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					totalVal = num1 - num2;
					strTotal = Integer.toString(totalVal);
					txtScreen.setText(strTotal);
				} else if (txtScreen.getText().contains("\u00D7")) {
					statement = txtScreen.getText().split("\\\u00D7");
					strNum1 = statement[0];
					strNum2 = statement[1];
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					totalVal = num1 * num2;
					strTotal = Integer.toString(totalVal);
					txtScreen.setText(strTotal);
				} else if (txtScreen.getText().contains("\u00F7")) {
					statement = txtScreen.getText().split("\\\u00F7");
					strNum1 = statement[0];
					strNum2 = statement[1];
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					totalVal = num1 / num2;
					strTotal = Integer.toString(totalVal);
					txtScreen.setText(strTotal);
				}
			}
		});

		// buttonAddition:
		buttonAddition.setSize(100, 50);
		buttonAddition.setLocation(325, 300);
		buttonAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("+");
			}
		});

		// button1:
		button1.setSize(100, 50);
		button1.setLocation(10, 245);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("1");
			}
		});

		// button2:
		button2.setSize(100, 50);
		button2.setLocation(115, 245);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("2");
			}
		});

		// button3:
		button3.setSize(100, 50);
		button3.setLocation(220, 245);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("3");
			}
		});

		// buttonSubtraction:
		buttonSubtraction.setSize(100, 50);
		buttonSubtraction.setLocation(325, 245);
		buttonSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("-");
			}
		});

		// button4:
		button4.setSize(100, 50);
		button4.setLocation(10, 190);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("4");
			}
		});

		// button5:
		button5.setSize(100, 50);
		button5.setLocation(115, 190);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("5");
			}
		});

		// button6:
		button6.setSize(100, 50);
		button6.setLocation(220, 190);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("6");
			}
		});

		// buttonMultiplication:
		buttonMultiplication.setSize(100, 50);
		buttonMultiplication.setLocation(325, 190);
		buttonMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("\u00D7");
			}
		});

		// button7:
		button7.setSize(100, 50);
		button7.setLocation(10, 135);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("7");
			}
		});

		// button8:
		button8.setSize(100, 50);
		button8.setLocation(115, 135);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("8");
			}
		});

		// button9:
		button9.setSize(100, 50);
		button9.setLocation(220, 135);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("9");
			}
		});

		// buttonDivision:
		buttonDivision.setSize(100, 50);
		buttonDivision.setLocation(325, 135);
		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("\u00F7");
			}
		});

		// buttonLeftParentheses:
		buttonLeftParentheses.setSize(100, 50);
		buttonLeftParentheses.setLocation(10, 80);
		buttonLeftParentheses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("(");
			}
		});

		// buttonRightParentheses:
		buttonRightParentheses.setSize(100, 50);
		buttonRightParentheses.setLocation(115, 80);
		buttonRightParentheses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append(")");
			}
		});

		// buttonPercentage:
		buttonPercentage.setSize(100, 50);
		buttonPercentage.setLocation(220, 80);
		buttonPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.append("%");
			}
		});

		// buttonAllClear:
		buttonAllClear.setSize(100, 50);
		buttonAllClear.setLocation(325, 80);
		buttonAllClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				txtScreen.setText(null);
			}
		});

		// Add Objects To Screen:
		frame.add(txtScreen);
		frame.add(button0);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);

		frame.add(buttonAddition);
		frame.add(buttonSubtraction);
		frame.add(buttonMultiplication);
		frame.add(buttonDivision);
		frame.add(buttonEquals);
		frame.add(buttonDecimalPoint);
		frame.add(buttonLeftParentheses);
		frame.add(buttonRightParentheses);
		frame.add(buttonAllClear);
		frame.add(buttonPercentage);
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
