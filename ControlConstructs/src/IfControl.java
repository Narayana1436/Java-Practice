import java.util.Scanner;

public class IfControl {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int marks=scan.nextInt();
		System.out.println("welcome to kodnest");
		report(marks);
		//simpe if conditional control construct
		
		
			
	
	}

	 static void report(int marks) {
		// TODO Auto-generated method stub
		if(marks>=80) {
			System.out.println("welcome to tech club");
		}
		
		
	}
	

}