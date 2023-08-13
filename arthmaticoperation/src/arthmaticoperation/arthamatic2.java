package arthmaticoperation;

import java.util.Scanner;

public class arthamatic2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(subtractNumber(num1,num2));
		System.out.println("Enter 2 numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		System.out.println(multiplyNumber(num1,num2));
		System.out.println("Enter 2 numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		System.out.println(divideNumber(num1,num2));
		System.out.println("Enter 2 numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		System.out.println(findReminder(num1,num2));
		System.out.println("Enter 2 numbers"); 
	}
		public static int subtractNumber(int num1,int num2) {
		return num1-num2;
	}
		public static int multiplyNumber (int num1,int num2) {
			return num1*num2; }
			
			public static double divideNumber (int num1,int num2) {
				return num1/num2; }
				public static int findReminder (int num1,int num2) {
				return num1%num2;
			
			
		
	}

}
