package methods;
import java.util.Scanner;

public class practicemethod3nad4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   String s=sc.next();
		   int x=sc.nextInt();
		   greet(s);
int res=age(x);
System.out.println(res);

	}
	public static void greet(String s) {
		
		System.out.println("Hello "+s+" how are you");
	}
public static int age(int a) {
	int b=2023;
	int c=b-a;
	return c;
}
} 
