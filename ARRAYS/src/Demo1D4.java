import java.util.Scanner;

public class Demo1D4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int []arr=new int[3];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(" enter the element");
			arr[i]=scan.nextInt();
			}
		System.out.println("Array contents are");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
