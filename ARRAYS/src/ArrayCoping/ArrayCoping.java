package ArrayCoping;
import java.util.Scanner;
public class ArrayCoping {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length");
		int arr1[][]=new int[scan.nextInt()][scan.nextInt()];
		int arr2[][]=new int[arr1.length][arr1.length];
		int arr3[][]=new int [arr1.length][arr1.length];
	 System.out.println("enter the elements of the 1st array");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
			arr1[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("enter the elemrnt of the 2nd array");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2[i].length-1;j++) {
			arr2[i][j]=scan.nextInt();
			}

}
		System.out.println(" enter 3rd array");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
			arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int i=0;i<=arr3.length-1;i++) {
			for(int j=0;j<=arr3[i].length-1;j++) {
			System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
}}}

