package com.review01_If_Scanner;

public class TypeConversation {
public static void main(String[] args) {
	

			int intNumber = 25;
			double doubleNumber = intNumber;
			System.out.println("The doubleNumber is " + doubleNumber);
			

			int numberInt = 19;
			byte numberByte = (byte) numberInt;
		
			numberInt = 260;
			numberByte = (byte) numberInt;
			System.out.println("The byte value is " + numberByte);
			numberByte = 80;

			numberInt = numberByte;
			System.out.println("The int value is " + numberInt);
			
			
			
}
}
