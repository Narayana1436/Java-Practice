package com.objectOrientiation;

class phone {

	int current;
	String color;
	String brand;
	int phonenumber;
	
	void call () {
		System.out.println("unlimited");}
	void  songs () {
		System.out.println("2000");}
	void videogames() {
		System.out.println("numberof");}
public static class phoneapp {
		public static void main(String[]args) {
			phone p1=new phone ();
			phone p2=new phone ();
			p1.call();
			p2.songs();
			p1.videogames();
			
			p1.current=1000;
			p1.color="black";
			p1.brand="samsung";
			p1.phonenumber=934615678;
			
			System.out.println(p1.current+" "+p1.color+" "+p1.brand+" "+p1.phonenumber);
			
			
			p2.current=10000;
			p2.color="blue";
			p2.brand="nokia";
			p2.phonenumber=630586842;
			
			System.out.println(p2.current+"  "+p2.color+"  "+p2.brand+" "+p2.phonenumber);

		}

	}

}
