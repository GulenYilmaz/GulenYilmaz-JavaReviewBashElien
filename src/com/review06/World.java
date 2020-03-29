package com.review06;

public class World {

	public static void main(String[] args) {
// how to create a baby
	
		System.out.println("----baby1-----");
	Baby	baby1= new Baby();
	baby1.cry();// turn string we must use sopln for executing
	System.out.println(baby1.cry());
	
	
	
	//assign  value
	baby1.firstName="John";
	baby1.lastName="Smith";
	baby1.gender='M';
	baby1.weigth=7;
	baby1.hairColor="yellow";
	
	//reassign  value 
	baby1.weigth=8;
	System.out.println("baby1 first name is  "+baby1.firstName);
	
	String babyLastname=baby1.lastName;
	System.out.println("baby lastname is "+babyLastname);
	
	
	String cryVariable=baby1.cry();
	System.out.println(cryVariable);
	baby1.talk(4);// 4 times it is executed
	baby1.walk();
	
	System.out.println("----baby2-----");
	Baby baby2= new Baby();
	
	System.out.println(baby2.cry());
	baby2.firstName="Selin";
	baby2.lastName="Atasoy";
	baby2.gender='F';
	baby2.weigth=6;
	baby2.hairColor="brown";
	
	
	
	System.out.println("----------");
	System.out.println("full name of baby2 is "+baby2.firstName+" "+baby2.lastName);
	baby1.displayBabyInfo();
	baby2.displayBabyInfo();
	
	
	
	}

}
