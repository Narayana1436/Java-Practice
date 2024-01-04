package EvenNumbersArray;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the elements");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the number ");
			arr[i]=scan.nextInt();
		}
		System.out.println("enter even number");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
			System.out.print(arr[i]+"");
		}
			
		}
	}

}
