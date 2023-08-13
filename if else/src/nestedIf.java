
public class nestedIf {

	public static void main(String[] args) {
		int a=2;
		int b=2;
		int  c=2;
		
		if (a==b) {
			//nested if else condition to check if c is equal to a and b
			if (a == c) {
				//all are equal
				System.out.println("equal");
			} else {
				//a!==c
				System.out.println("not equal");
				}
		} else {
			//a!=b
			System.out.println("not equal");
		}
		

	}

}
