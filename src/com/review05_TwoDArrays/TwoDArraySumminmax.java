package com.review05_TwoDArrays;

public class TwoDArraySumminmax {

	public static void main(String[] args) {


		int [][] num = {{7,1,6,12},
	            {9,6,2,8},
                {3,0,8,5}
                };
		
		// how to iterating a 2D Array
		int rows =num.length;// 3 rows
		
		for (int i=0; i<rows; i++) {  // do not use-->  =
			
			System.out.println("I am at row index "+i);
			
			int length =num[i].length;
			for (int j=0; j<length; j++) {
				int element =num[i][j];
				System.out.print(element+" ");
			}System.out.println();
		}
		
		
		// sum of a all elements in a 2D array
		int sum=0;
		
		// iterating rows
		for (int row=0; row<num.length; row++) {
		
		// itersting elements in a row
		for( int col=0; col<num[row].length; col++) {
			
				sum+=num[row][col];
			}
		}System.out.println("the sum of all number is "+sum);
		
//find max min in a 2D array
		
		int min= num[0][0];
		int max= num[0][0];
		
		for(int i=0; i<num.length;i++) {
		for(int j=0; j<num[i].length; j++) {
			int element=num[i][j];
			
			if(element<min) {
				min=element;
				
				}
			if(element>max) {
				max=element;
			}
		  }
		}
		System.out.println("minimum is "+min);
		System.out.println("maxsimum is "+max);
		
		
		
	}	
	}


