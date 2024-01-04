 package EvenNumbersArray;

import java.util.Scanner;

public class Divisible5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the elemntes");
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the divisible");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%6==0) {
			System.out.println(arr[i]+" ");
		}
		
	

	}

}}
