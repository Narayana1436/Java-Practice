package SelectionSort;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	 Scanner scan=new Scanner (System.in);
    System.out.println("enter the length");
    int arr[]=new int[scan.nextInt()];
    System.out.println("enter"+arr.length+"element");
    for(int i=0;i<=arr.length-1;i++) {
    	arr[i]=scan.nextInt();
    }
   System.out.println("enter before selection sort");
   for(int i=0;i<=arr.length-1;i++) {
   	System.out.print(arr[i]+" ");
    }
   System.out.println();
   int min;
   int pos;
    for(int i=0;i<=arr.length-2;i++) {
    	 min=arr[i];
    	 pos=i;
    	for(int j=i+1;j<=arr.length-1;j++) {
    	if(arr[j]<min) {
    		min =arr[j];
    		pos=j;
    	}
    	System.out.println(arr[j]+" ");
    	}
    		int help=arr[i];
    		arr[i]=arr[pos];
    		arr[pos]=help;
    		System.out.println();
    	}
   
   	System.out.println("after selection sort");
    for(int i=0;i<=arr.length-1;i++) {
    	System.out.print(arr[i]+" ");
    	}
    }
    	}


