package practice;
import java.util.Scanner;
/**************************** Getting input form user*****************/
public class InputDemo {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);  // This line scans the input and stored in the specified variable.
		
		System.out.println("what is your name");
		String name = scanner.nextLine();  // the input obtained from the user is stored and used for display.
		System.out.println("what is your rating from 1 to 5");
		float rating = scanner.nextFloat();  // the input rating obtained from user is stored here.
		scanner.nextLine();                  // this line does noting other than helping the next scanner line. 
		                                     //indha line illana previous line namba enter button ah press pandradha oru string ah concider pannikum so 
		                                     //next string scanner ku endha input um kedaikama poidum
		
		
		
//		short rating= scanner.nextShort();  //different data types can be used 
//		byte rating = scanner.nextByte();   // For using different data types use the appropriate (next.) function
		System.out.println("Enter your email");
		String email = scanner.nextLine();    // nextline(); function is used for all strings.
		
		
		System.out.println("Hello " + name + "👋");
		System.out.println("You rated us : " + rating + "⭐");
		System.out.println("Email ID : " + email);
	}
	

}
