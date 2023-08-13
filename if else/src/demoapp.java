import java.util.Scanner;

public class demoapp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter score");
		int score=scan.nextInt();
		demo1 d=new demo1();
		d.score(score);
//		System.out.println(score);

	}

}
