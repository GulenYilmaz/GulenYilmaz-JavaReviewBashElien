package com.review06;

public class Baby {
// this is our template
	String firstName;
	String lastName;
	char gender;
	int weigth;
	String hairColor;
	
	
	public String cry() {
           return "baby is crying";	
}	
	
	
	public void talk(int times) {
		for (int i=1; i<=times; i++) {
		System.out.println("baby is talkin bla bla bla...");
	}
}
	
	public void walk() {
		System.out.println("baby is walking...");
	}
	//void means --->does not returning anything
	
	public void displayBabyInfo() {
		System.out.println("full name of baby2 is "+firstName+" "+lastName);
        System.out.println("gender is "+gender);
        
        if(gender=='M') {
        	System.out.println("Girl");
        }else if (gender=='F'){
        	System.out.println("Boy");
        }else {
        	System.out.println(" ");
        }
        
        
        System.out.println("hair color is"+hairColor);
	
	}
	
	
	
	
	
}
