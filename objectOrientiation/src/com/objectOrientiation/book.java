package com.objectOrientiation;

public class book {

	
		int pages;
		String books;
		String colours;

		
		void pages() {
			System.out.println("unlimited");}
		void books() {
			System.out.println("100 books");}
				void colour(){
					System.out.println("no limt");}
				

				public static void main(String[] args) {
					book s1=new book();
					book s2=new book();
					s1.pages();
					s2.books();
					s1.colour();
					
					s1.pages=100;
					s1.books="40";
					s1.colours="20";
					
					s2.pages=200;
					s2.books="60";
					s2.colours="100";
					
					System.out.println(s1.pages);
					System.out.println(s1.books);
					System.out.println(s1.colours);
					
					System.out.println(s2.pages);
					System.out.println(s2.books);
					System.out.println(s2.colours);
					
					
				}
				}

		

	


