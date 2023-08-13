package methods;

public class allmethodsexamples {

	public static void main(String[] args) {
		greet();
		int x=20;
		int y=10;
		int res=multi(x,y);
		System.out.println("multiplication result"+res);
		int res1=add(x,y);
		System.out.println("addition result is"+res1);
		boolean res2=checkGreater(x,y);
		System.out.println(res2);
		int res3 = add(x,y)/2;
				System.out.println("average is"+res3);}
		public static void greet() {
			System.out.println("Hello world......");
		}
		public static int add (int x,int y) {
			return x+y;}
			public static void sub () {
				int a=20;
				int b=10;
				System.out.println("subtraction Result is " +(a-b));}
				public static int div (int m,int n) {
					return m/n;}
				public static int mod (int a,int b) {
					return a%b;}
				public static int multi (int x,int y) {
					return x*y;}
				public static boolean checkGreater(int x,int y) {
					return x>y;
					
					
					
				}
				
			}
			
			
			
		
