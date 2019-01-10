package com.java.iftest;

import java.util.ArrayList;
import java.util.Scanner;

public class GetFakeAverage {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double [] arr = new double[N];
		double M = 0;
		double sum = 0;
		
		
		// 1. 점수들 중 max값 구하기
		for (int i=0; i<N; i++) { 
			arr[i] = sc.nextInt();
			
			if (M<arr[i]) M = arr[i];
			
		}
		
		
		// 2. 점수 조작하기 (점수/max * 100)
		for (int i=0; i<N; i++) {

			arr[i] = (arr[i]/M) * 100;
			sum += arr[i];
		}
		
		
		
		// 3. 평균 구하기
		
		System.out.printf("%.2f", sum/N);
		
		sc.close();
	}

}
