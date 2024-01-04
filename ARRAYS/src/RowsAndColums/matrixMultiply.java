package RowsAndColums;
import java.util.Scanner;

public class matrixMultiply {

	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("enter rows and colums");
	int rows=scan.nextInt();
	int colums=scan.nextInt();
	int arr[][]=new int[rows][colums];
	System.out.println("enter"+(rows*colums)+"elements");
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			arr[i][j]=scan.nextInt();
			
		}
}
	System.out.println(" before rows and colums ");
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
System.out.println("main");
for(int k=0;k<=rows-1;k++) {
	System.out.print(arr[k][colums-1]+" ");
}
//for(int k=1;k<=rows-1;k++) {
//	System.out.print(arr[k][colums-1]+" ");
//}
//for(int k=colums-2;k>=0;k--) {
//	System.out.print(arr[rows-1][k]+" ");
//	
//	}
//for(int k=rows-2;k>=1;k--) {
//	System.out.print(arr[k][0]+" ");
//}
//for(int k=1;k<=colums-2;k++) {
//	System.out.println(arr[1][k]+" ");
//	
//}
//	

	}

}
