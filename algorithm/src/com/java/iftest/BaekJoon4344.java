package com.java.iftest;

import java.util.Scanner;

public class BaekJoon4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int[] arr = new int[C];
		
		int[] arrsum = new int[C];
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<C; i++) {
			int N = sc.nextInt();
			int[] arr2 = new int[N];
			arr[i] = N;
			
			for (int j=0; j<N; j++) {
				arr2[j] = sc.nextInt();
				sum += arr2[j];
				int avg = sum/N;
				
				if (arr2[j] > avg) {
					count++;
				}
				
				for (int k=0; k<C; k++) {
					arrsum[k] = sum/N*100;
				}
				
				
			}
				
		}
		
		
		sc.close();
	}

}
