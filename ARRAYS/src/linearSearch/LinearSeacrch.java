package linearSearch;

import java.util.Scanner;

public class LinearSeacrch {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enterv the array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter"+arr.length+"elemen");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		

	}

}
