package com.java.arraytest;

import java.util.Scanner;

public class BaekJoon10039 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
			
			if(score[i] < 40) score[i] = 40;
			
			sum += score[i];
		}
		avg = sum/5;
		System.out.println(avg);
	}

}
