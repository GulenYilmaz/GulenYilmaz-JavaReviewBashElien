package com.review01_If_Scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		String firstLine = scan.nextLine();
		System.out.println("firstLine was: " + firstLine);	
		
		String firstWord = scan.next();
		System.out.println("firstWord was: " + firstWord);
		
		String secondWord = scan.next();
		System.out.println("secondWord was: " + secondWord);
		
		String thirdWord = scan.next();
		System.out.println("thirdWord was: " + thirdWord);
	
	}
}
