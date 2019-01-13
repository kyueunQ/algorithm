package com.java.iftest;

public class Problem05 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			for(int j=i+1; j<=i+10; j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
