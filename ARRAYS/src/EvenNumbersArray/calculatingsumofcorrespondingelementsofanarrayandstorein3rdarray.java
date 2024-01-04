package EvenNumbersArray;

import java.util.Scanner;

public class calculatingsumofcorrespondingelementsofanarrayandstorein3rdarray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of arays"); 
		int arr1[]=new int[scan.nextInt()];
		int arr2[]=new int[arr1.length];
		System.out.println("enter"+arr1.length+"elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("enter"+arr2.length+"elemnts");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		int arr3 []=new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i]=arr1[i]+arr2[i];	
			}
		System.out.println("arr-->");
		for(int i=0;i<=arr1.length-1;i++) {
		System.out.println(arr1[i]+"");		
		}
		System.out.println();
		System.out.println("arr2-->"+" ");
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.println(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("arr3-->"+"");
		for(int i=0;i<=arr3.length-1;i++) {
			System.out.println(arr3[i]+" ");
		}
		
		
		

	}

}
