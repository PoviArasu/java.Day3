package practice;
import java.util.Scanner;
public class OperatorsAssingment {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("Please Enter the First Number");
//		double a = scanner.nextDouble();
//		System.out.println("Please Enter the Second Number");
//		double b = scanner.nextDouble();
////		double c,d,e,f,g;
////		c=a+b;
////		d=a-b;
////		e=a*b;
////		f=a/b;
////		g=a%b;
////		
////		System.out.println("Addition of " + (a) + " + " + (b) + " = "  + c);
////		System.out.println("Subtraction of " + (a) + " - " + (b) + " = "  + d);
////		System.out.println("Multiplication of "+ (a) + " * " + (b) + " = "  + e);
////		System.out.println("Division of "+ (a) + " / " + (b) + " = "  + f);
////		System.out.println("Modulus of "+ (a) + " % " + (b) + " = "  + g);
//		
//		/*********** COMPOUND ASSINGMENT ************/
//		int z=100;
//		a=a+z;
//		b=b+z;
//		System.out.println("Adding 100 to First  Number using Compound Assignment = "+a);
//		System.out.println("Adding 100 to Second Number using Compound Assignment = "+b);		
//		
		
		int a=3, b=4,c;
		c= a+b+a+b+++a+++b;
		System.out.println(c);
		
		
//		Line 1: Variable Declaration and Initialization
//
//		int a = 3, b = 4, c;
//		This line declares three integer variables: a, b, and c.
//		a is initialized to 3.
//		b is initialized to 4.
//		c is declared but not yet assigned a value.
		
//		Line 2: Calculating c
//
//		c = a + b + a + b++ + a++ + b;
//		This line calculates the value of c using the post-increment operator (++).
		
//		Let's trace the evaluation step by step:
//		a + b + a + b++ + a++ + b
//		a + b + a + b++
//		a is 3, b is 4.
//		This part becomes 3 + 4 + 3 + 4 (because b++ uses the current value of b, which is 4).
//		After this part of the line is evaluated, b becomes 5.
//		+ a++
//		a is currently 3.
//		This part becomes + 3 (because a++ uses the current value of a, which is 3).
//		After this part of the line is evaluated, a becomes 4.
//		+ b
//		b is now 5, because it was incremented earlier.
//		This part becomes + 5.
//		Therefore: c = 3 + 4 + 3 + 4 + 3 + 5;
//		c = 22;

		
	}

}
