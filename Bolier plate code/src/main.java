import java.util.Scanner;

public class main {

	public static void check(int grade) {
		if(grade>50){
System.out.println("pass");}
		else {                        //pass or fail alla vachinapudu else vadalli    
			
			System.out.println("fail");     
		}
	}
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter pass or fail");
	  //int n=scn.nextint();
	int grade=scan.nextInt();
	   check(grade);
	
	
}
}
