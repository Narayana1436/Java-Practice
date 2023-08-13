import java.util.Scanner;

public class joinStrings {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		String a="Hello";
		String b="World!";
		String str3 =  joinStrings(a,b);
		System.out.println(str3);
		
		 
		  
		
		

	}
       public static String joinStrings(String Str1,String Str2) {
    	   String str3=Str1+Str2;
    	    return str3;
       }
}
