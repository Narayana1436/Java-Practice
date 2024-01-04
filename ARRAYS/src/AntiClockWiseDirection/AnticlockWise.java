package AntiClockWiseDirection;

import java.util.Scanner;

public class AnticlockWise {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println();
		System.out.println("array elements before anticlockwise");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		int temp=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	System.out.println();
		System.out.println("arrya elements after anticlockwise");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println();
		}
		

	}

}
