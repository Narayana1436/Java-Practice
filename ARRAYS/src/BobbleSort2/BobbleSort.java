package BobbleSort2;
import java.util.Scanner;
public class BobbleSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter"+arr.length+"element");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the array before sorting");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		// differnt class 
		BobbleSortApp sort=new BobbleSortApp();
		sort.BobblesortApp(arr);
		System.out.println();
		System.out.println("array elementa after sorting");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
				
		

	}

}
