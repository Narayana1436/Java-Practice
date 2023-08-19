import java.util.Scanner;

public class main {

	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100) {
			//yakuva thakuvaki less than or greather then vaste if vadutharu
		
			System.out.println("Discount applicable");
		}
		}
		public static void main(String[]args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a number");
			 // doubl n=scan.nextDouble();
			double purchaseAmount=scan.nextDouble();
			checkDiscount(purchaseAmount);
			
			
			
			

	}

}
