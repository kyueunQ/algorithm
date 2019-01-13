package com.java.iftest;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		
		if(n%2 != 0) {
			
			for(int i=1; i<=n; i++) {
				
				if(i%2 != 0) sum += i;
			}
			
		} else {
			
			for(int i=1; i<=n; i++) {
				
				if(i%2 == 0) sum += i;
			}
		}
		System.out.println("결과값: " + sum);
	}

}
