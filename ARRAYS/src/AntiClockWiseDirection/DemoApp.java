package AntiClockWiseDirection;

import java.util.Scanner;

public class DemoApp {

	public static void anticlockwise(int arr[],int n) {
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