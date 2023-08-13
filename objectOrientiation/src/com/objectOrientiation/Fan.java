package com.objectOrientiation;

public class Fan {
	int nooffans;
	int cost;
	String color;
	String brand;
   void rotate() {
	System.out.println("fan can rotate");}
	void blowAir () {
		System.out.println("fan gives air");
		}
}
	         class fanapp {
				public static void main (String[]args) {
					Fan t1=new Fan ();
					Fan t2=new Fan ();
					t1.rotate();
					t2.blowAir();
					t1.nooffans =5;
					t1.cost=3500;
					t1.color="white";
					t1.brand="usha";
					System.out.println(t1.nooffans+" "+t1.cost+" "+t1.color+" "+t1.brand);
					
					t2.nooffans =8;
					t2.cost=4500;
					t2.color="black";
					t2.brand="cromton";
					System.out.println(t2.nooffans+" "+t2.cost+" "+t2.color+" "+t2.brand);
					
					}
			 }
					
					
				
					
				