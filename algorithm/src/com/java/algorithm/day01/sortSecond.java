package com.java.algorithm.day01;

import java.util.Scanner;

public class sortSecond {
	
	static int num3(int A, int B, int C) {
	
		if ((B >= A && C <= A) || (C >= A && B <= A))
			return A;
		else if ((A > B && C <= B) || (C >= B && A <= B))
			return B;
		return C;

			
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A;
		int B;
		int C;
		
		do {
			System.out.println("100보다 작은 자연수 3개를 입력하세요.");
			A = sc.nextInt(); B = sc.nextInt();	C = sc.nextInt();
			
		} while(A <= 0 || A > 100 || B <= 0 || B > 100 || C <= 0 || C> 100);
		
		System.out.println(num3(A, B, C));
		
	}

}
