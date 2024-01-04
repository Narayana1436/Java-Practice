 import java.util.Scanner;

public class demo1D2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		String emp[]=new String[8];
		for(int i=0;i<=emp.length-1;i++) {
			System.out.println("enter the name of emp");
			emp[i]=scan.next();
		}
		System.out.println("list of empolyes");
		for(int i=0;i<=emp.length-1;i++) {
			System.out.print(emp [i]+" ");
		}

	}

}
