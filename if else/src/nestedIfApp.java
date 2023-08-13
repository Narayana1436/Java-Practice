import java.util.Scanner;

public class nestedIfApp {

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
//	  System.out.println("equal or not equal");
	   int s1=scan.nextInt();
	   int s2=scan.nextInt();
	   int s3=scan.nextInt();
	   if(s1==s2) {
		   System.out.println(" s1 and s2 are equal....");
		   if (s1==s3) {
			   System.out.println("all are equal");
		   }
	   }
	  // nestedIf s2 = new nestedIf ();
	 //  s2.s1(equal);

	}

}
