package com.java.arraytest;

import java.util.Scanner;

public class Problem05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] Lotto = new int[6]; 
				
		for(int i=0; i<Lotto.length; i++) {
			
			Lotto[i] = (int)(Math.random()*45)+1;
			
		}
		
		  
		
	}
	
	


}
