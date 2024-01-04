package AntiClockWiseDirection;

import java.util.Scanner;

public class AntiClockWiseApp {

	public static void AntiClockWise(int arr[],int n) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println();
		System.out.println("array elements before anticlockwise");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]+" ");
		}
		DemoApp sort=new DemoApp();
		sort. anticlockwise(arr,n);
	

	}

}
