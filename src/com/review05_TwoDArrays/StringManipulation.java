package com.review05_TwoDArrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		
	//1 length	
	String str= "Hello";
	int a=5; // you can not a.length because it is not string
	
	int length =str.length();// it is goes to int
	System.out.println(length);
		
		
	//2 toUpperCase
	str=str.toUpperCase();
	System.out.println(str);
		
		
	//3 toLowerCase
	str=str.toLowerCase();
	System.out.println(str);// toUpperCase or toLowerCase bosluk onemli degil
		
		
	// 4 equals("")
	str.equals("Hello");
	System.out.println(str.contentEquals("hello"));	
		
	// 5 startsWith("")  and endsWith("")
	str.startsWith("he");
	System.out.println(str.startsWith("hep"));	
	str.endsWith("he");
	System.out.println(str.endsWith("hep"));	
	
	
	// 6 Method chaining 
	str.toLowerCase().startsWith("Hello");
	System.out.println(str.contentEquals("hello"));	
					
	// 7 charAt(index number);
	str.charAt(4);
	System.out.println(str.charAt(4));	
						
		
	// 8 toCharArray 
	String reverse="";	
	char [] charArray=str.toCharArray();
		for ( int i=charArray.length-1; i>=0;i--) {// tersden yazdirmak istersek
			reverse+= charArray[i];
		}
		System.out.println("reverse is  "+reverse);   
		
	
		
	// 9 indexOf ("  ");
	int index = str.indexOf("llo");
	System.out.println(index);	
				
		
	String example="something inside here";
	int index2=example.indexOf("e",7);// 7 den sonrasina bak
	
	System.out.println(index2);
		
		
	}

}
