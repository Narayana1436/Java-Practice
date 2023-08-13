package com.objectOrientiation;

public class benchapp{
	public static void main (String[]args) {
		bench t1=new bench();
		bench t2=new bench();
		t1.allowtosit();
		t2.allowtowrite();
		t1.seatingcapacity=5;
		t1.cost=1000;
		t1.color="black";
		t1.brand="greenwood";	
		t2.seatingcapacity=20;
		t2.cost=2000;
		t2.color="blue";
		t2.brand="greenwood";
							
	
				
							System.out.println(t1.seatingcapacity+" "+t1.cost+" "+t1.color+" "+t1.brand);
							
							System.out.println(t2.seatingcapacity+" "+t2.cost+" "+t2.color+" "+t2.brand);
							
			
							
					 
							
							
						


		
		
		
		
		
	}


}

