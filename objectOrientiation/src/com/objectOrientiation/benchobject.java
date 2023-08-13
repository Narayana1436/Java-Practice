
		 package com.objectOrientiation;

		 class benchobject{

			int bench;
			String teachers;
			int rooms;
			
			void bench() {
				System.out.println(10);}
			void teachers () {
				System.out.println("ninty");}
			void rooms () {
				System.out.println(40);}
		public static class benchobjectapp{	
			public static void main(String[]args) {
				benchobject s1=new benchobject();
				benchobject s2=new benchobject();
				
				s1.bench();
				s2.teachers();
				s1.rooms();
				
				s1.bench=20;
				s1.teachers="ninty";
				s1.rooms=40;
				
				s2.bench=30;
				s2.teachers="ninty";
				s2.rooms=50;
				
				System.out.println(s1.bench);
				System.out.println(s1.teachers);
				System.out.println(s1.rooms);
				
				System.out.println(s2.bench);
				System.out.println(s2.teachers);
				System.out.println(s2.rooms);
				
				
				
				

			}

		


		}
		 }


