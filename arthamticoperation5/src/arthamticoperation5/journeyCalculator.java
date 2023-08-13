package arthamticoperation5;

import java.util.Scanner;

public class journeyCalculator {

	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Speed And Time To calculate Distance");
		
		double speed =scan.nextDouble();
		double time=scan.nextDouble();
		 journeyCalculator journeyCalculator=new journeyCalculator();
		 double distance=journeyCalculator.calculateDistanceApp(speed,time);
		
	     System.out.println(distance);
	
	}
	     

	
	public double calculateDistanceApp(double speed,double time){
		
		
		 return speed*time;
	}

}
