package methods;

import java.util.Scanner;

public class practicemethod3and4 {
	 public static void main (String[]args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter your name and year of Birth");
		 String name =scan.nextLine();
		 int yearofBirth =scan.nextInt();
		 greet(name);
		int res=calculateage(yearofBirth);
		System.out.println("you are"+res+"years old....");
		 
		 
	 }
public static void greet(String name) {
	System.out.println("Hello"+name);
}
	


public static int calculateage(int yearofbirth) {
	
	return 2023-yearofbirth;
	
}
}