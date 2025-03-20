/************************ARITHMETIC OPERATORS*********************/

//package practice;
//
//public class Operators {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// + plus ,  - minus,  *  multiply,  / divide,  %  	modulus
//		int a = 10, b =29, c,d,e,i;
//		double g=100.267,h=23.00006,f,f1,f2;
//		c=a+b;
//		d=b-a;
//		e=a*b;
//		f=g/h;
//		f1=g+h;
//		f2=g-h;
//		i=a%b;   // gives the quotient value.
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(f1);
//		System.out.println(f2);
//		System.out.println(i);
//	}
//
//}


/*********************************************Compound Assignment**********************************/
//package practice;
//
//public class Operators {
//
//	public static void main (String args []) {
//		int a=1,b=2,c;
//		//a=b+b;
//		a+=b+b;  // which means a=a+3 where we going to add a on both sides. cannot be used if we going add different variables
//		System.out.println(a);
//	}
//}


/********************************** Increment or Decrement Operators ****************************/

package practice;

public class Operators {

	public static void main (String args []) {
		int a=10,b=4,c,d;
//		a=a+1;
//		a++; // (post Increment operator)          ALL
//		++a; // (pre-Increment operator)            ARE
//	 
//		a--; // (post Decrement operator)              SAME AS
//		--a; // (pre-Decrement operator)                    ADDING or SUBRACTING 1
		c=a++;
		d=++a;
		System.out.println("a is "+a);
		System.out.println("c is "+c);
		System.out.println("d is "+d);
	}
}






