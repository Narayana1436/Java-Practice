
public class JourneyCalculator {

	public static void main(String[] args) {
		 double x=60.0;
		 double y=1.5;
		 
		 double c=calaculatorDistance(x,y);
		 
		System.out.println(c);

	
	}
	public static double calaculatorDistance(double speed ,double time ) {
               double c=speed*time;
               return c;
	}             
}
