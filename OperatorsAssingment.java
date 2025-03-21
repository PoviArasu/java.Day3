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
/**************************** Pre-increment & post increment **********************************/
 		
		int a = 3, b = 4, c;
		c = a + b + a++ + b++ + ++a + ++b; // c = 3 + 4 + 3 + 4 + 5 + 6 = 25
		System.out.println(c); // Output: 25
		// a now equals 5
		// b now equals 6
	}

}
