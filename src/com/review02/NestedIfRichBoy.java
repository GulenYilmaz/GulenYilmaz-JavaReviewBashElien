package com.review02;

import java.util.Scanner;

public class NestedIfRichBoy {

	public static void main(String[] args) {
    
		Scanner input= new Scanner(System.in);
		   
		
		System.out.println("Are you boy or girl?" );
     //   String boyGirl=input.nextLine(); 
		String boyGirl=input.next();  //next () ---> sadece bosluga kadar aliyor
        System.out.println("You entered "+boyGirl);
	    boolean rich=input.nextBoolean();

	System.out.println("you are a: "+boyGirl+" and you are rich"+rich);
	
	if (boyGirl.equals("girl")) {
		//boy
		System.out.println("Yaaayy");
		if(rich) {
			//  rich boy
			System.out.println("Buy a ferrari.");
		}else {
			// poor boy
			System.out.println("Play sports");
			
		}
	}else if (boyGirl.equals("girl")) {
		//girl
		System.out.println("Yay");
if(rich) {
	//rich girl
	System.out.println("Buy Louris Vuitton ");
}else {
	//poor girl
	System.out.println("Read a book");
}
	}else {
		//neither boy or girl
		System.out.println("you entered a wrong choice.");
	}
	
	System.out.println("We are done.");
	
	
}
}
