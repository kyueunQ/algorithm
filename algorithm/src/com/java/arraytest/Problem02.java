package com.java.arraytest;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in); 
		int[] inputFiveNum = new int[5];
		int sum = 0;
		
		for (int i=0; i<inputFiveNum.length; i++) {
			inputFiveNum[i] = sc.nextInt();
			sum += inputFiveNum[i];
			
		}
		double avg = sum/inputFiveNum.length;
		System.out.printf("평균은 " + "%.1f" + " 입니다.", avg);
		
	}
}
