package calculator;
import java.util.Scanner;

import operations.AddOperations;
import operations.DivideOperation;
import operations.MultiplyOperation;
import operations.SubOperations;
public class InteractiveCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int numA = s.nextInt();
		s.nextLine();
		System.out.println("Enter 2nd number:");
		int numB = s.nextInt();
		s.nextLine();
		System.out.println("Enter operator:");
		String op = s.nextLine();
		s.nextLine();
		int result = 0;

		if(op.equals("add")) {
			AddOperations add = new AddOperations();
			add.setA(numA);
			add.setB(numB);
			result = add.getResult();
		}else if(op.equals("sub")) {
			SubOperations sub = new SubOperations();
			sub.setA(numA);
			sub.setB(numB);
			result = sub.getResult();			
		}else if(op.equals("mul")) {
			MultiplyOperation mul = new MultiplyOperation();
			mul.setA(numA);
			mul.setB(numB);
			result = mul.getResult();
		}else if(op.equals("div")) {
			DivideOperation div = new DivideOperation();
			div.setA(numA);
			div.setB(numB);
			result = div.getResult();
		}else{
			System.out.println("Did not understand");
		}
		System.out.println("Result" + result);
	}

}
