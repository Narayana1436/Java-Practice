package EvenNumbersArray;

import java.util.Scanner;

public class oddNUmber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the element");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the number");
		for(int i=0;i<=arr.length-1;i++) {
			//System.out.println("enter the number");
			arr[i]=scan.nextInt();
		}
		System.out.println("enter odd number");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
			System.out.println(arr[i]+"");

			}
	}}

}
