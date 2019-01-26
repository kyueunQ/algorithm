package com.java.fortest;

import java.util.Scanner;

public class BaekJoon11720 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numCount = sc.nextInt();
		int[] numArray = new int[numCount];
		int sum = 0;
		
		for(int i=0; i<numArray.length; i++) {
			numArray[i] = sc.nextInt();
			sum += numArray[i];
		}
		
		System.out.println(sum);
	}

}
