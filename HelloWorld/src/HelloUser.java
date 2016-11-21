import java.util.Scanner;

public class HelloUser {

	//Variable
	private String userName;

	//constructor
	public HelloUser(){
		userName = "David";
	}
	
	//greeting User function
	public void greetUser(){
		System.out.print("Please enter your name:  ");
		Scanner scan = new Scanner(System.in);
		userName = scan.nextLine();
		scan.close();
		System.out.println("Hello "+userName);
		
	}
	
	
}
