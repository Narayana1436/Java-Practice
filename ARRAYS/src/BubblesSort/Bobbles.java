package BubblesSort;

import java.util.Scanner;

public class Bobbles {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the bubble length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter"+arr.length+"element");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
		System.out.println(" after swaping");
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		System.out.println("after bobble sort of array");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
