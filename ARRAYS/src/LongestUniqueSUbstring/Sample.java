package LongestUniqueSUbstring;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("enter the string");
	String str=scan.nextLine();
	findSubString(str);
	
	}
	public static void findSubString(String str) {
		String max="";
		for(int i=0;i<=str.length()-1;i++) {
			for( int j=i+1;j<=str.length();j++ ) {
				String subString=str.substring(i,j);
				boolean res=isUnique(subString);
				if(res==true) {
					if(subString.length()>max.length()) {
						max=subString;
						
					}
				}
			}
		}
		System.out.println("Max unique substring "+max);
	}
	public static boolean isUnique(String s) {
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return false;
					
				}
			}
			}
		return true;
				
	}
	
	

}
