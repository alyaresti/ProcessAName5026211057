import java.util.Scanner;

public class ProcessAName5026211057 { 
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Type your First and Last Name: ");
	String name = sc.nextLine();
	int space1 = name.indexOf(' ');
	String lastName = name.substring(space1+1); 
	System.out.println("Your name is: " + lastName + ", " + name.charAt(0) + ".");
	}
}