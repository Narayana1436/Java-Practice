package arthamaticoperation6;

public class TemperatureConverter {

	public static void main(String[] args) {
		  double f=68.0;
		   double k=findTemperatureInFahrenheit(f);
		   System.out.println(k);

	}

	public static double findTemperatureInFahrenheit(double f) {
		   double  k=(f-32)*(5.0/9.0);
		   return k;
		
	}

}
