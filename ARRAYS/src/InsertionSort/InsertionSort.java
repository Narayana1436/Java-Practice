package InsertionSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length");
		int arr[]=new int[scan.nextInt()];
	 System.out.println("enter"+arr.length +"elements");
	 for(int i=0;i<=arr.length-1;i++) {
		 arr[i]=scan.nextInt();
		 
		}
	 System.out.println("enter before insertionSort");
	 for(int i=0;i<=arr.length-1;i++) {
		 System.out.println(arr[i]+" ");
		 
	 }
	 InsertionSortApp sort=new InsertionSortApp();
	 sort.insertionSortApp(arr);
	 System.out.println();
	 System.out.println("enter elemrnts after sorting");
	 for(int i=0;i<=arr.length-1;i++) {
		 System.out.println(arr[i]+" ");
	 }

	}

}
