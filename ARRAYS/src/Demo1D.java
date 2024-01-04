 import java.util.Scanner;

public class Demo1D {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float height[]=new float[10];
		for(int i=0;i<=height.length-1;i++) {
			System.out.println("height of players");
			height[i]=scan.nextFloat();
			}
		System.out.println("list of players");
		for(int i=0;i<=height.length-1;i++) {
			System.out.print(height[i]+" ");
		}
		

	}

}
