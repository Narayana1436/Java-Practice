package EvenNumbersArray;
import java.util.Scanner;
public class mergeelementsof2arraysinto3rdarray {
	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter the length of the arr-1");
	   int arr1[]=new int[scan.nextInt()];
	   System.out.println("enter the length of the arr-2");
	   int arr2[]=new int[scan.nextInt()];
	   System.out.println("enter"+arr1.length+"element");
	   for(int i=0;i<=arr1.length-1;i++) {
		   arr1[i]=scan.nextInt();
	   }
	   System.out.println("enter"+arr2.length+"element");
	   for(int i=0;i<=arr2.length-1;i++) {
		   arr2[i]=scan.nextInt();
	   }
	   int arr3[]=new int[arr1.length+arr2.length];
	   int i=0;
	   for(int j=0;j<=arr1.length-1;j++) {
		   arr3[i]=arr1[j];
		   i++;
	   }
	   for(int j=0;j<=arr2.length-1;j++) {
		   arr3[i]=arr2[j];
		   i++;
	   }
	   System.out.println("arr1-->");
	   for(int j=0;j<=arr1.length-1;j++) {
		   System.out.println(arr1[j]+" ");
	   }
	   System.out.println();
	   for(int j=0;j<=arr2.length-1;j++) {
		   System.out.println(arr2[j]+" ");
		     }
	   System.out.println();
	   for(int j=0;j<=arr3.length-1;j++) {
		   System.out.println(arr3[j]+" ");
		   
	   }
	   

	}

}
