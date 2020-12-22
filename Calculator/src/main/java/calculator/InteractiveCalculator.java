package calculator;
import java.util.Scanner;

import operations.AddOperations;
import operations.DivideOperation;
import operations.MultiplyOperation;
import operations.SubOperations;
public class InteractiveCalculator {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter 1st number:");
		final float numA = s.nextInt();
		s.nextLine();
		System.out.println("Enter 2nd number:");
		final float numB = s.nextInt();
		s.nextLine();
		System.out.println("Enter operator: + or - or * or /");
		String operator = s.next();
		s.nextLine();
		double result = 0;
		result = (double)calculator(numA, numB, operator);
	    System.out.println("Result" + result);

	}

	private static double calculator(float numA, float numB, String operator) {
		double result = 0;
		boolean process = true;
		while(process) {
			switch(operator) {
			case "+":
				AddOperations add = new AddOperations();
				add.setA(numA);
				add.setB(numB);
				result = add.getResult();
				process = false;
				break;
			case "-":
				SubOperations sub = new SubOperations();
				sub.setA(numA);
				sub.setB(numB);
				result = sub.getResult();
				process = false;
				break;
			case "*":
				MultiplyOperation mul = new MultiplyOperation();
				mul.setA(numA);
				mul.setB(numB);
				result = mul.getResult();
				process = false;
				break;
			case "/":
				DivideOperation div = new DivideOperation();
				div.setA(numA);
				div.setB(numB);
				result = div.getResult();
				process = false;
				break;
			default:
				System.out.println("Please enter correct operator!");
				operator = s.nextLine();
				process = true;
				break;
			}
		}
		return result;
	}

}
