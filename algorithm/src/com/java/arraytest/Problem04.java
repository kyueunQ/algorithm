package com.java.arraytest;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: "); int money = sc.nextInt();
		int separateMoney[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int value = 0;
		
		for (int i=0; i<separateMoney.length; i++) {
			
			value = money/separateMoney[i];
			money -= value*separateMoney[i];
			System.out.println(separateMoney[i] + "원:" + value + "개");
		}
		
		sc.close();
		
		
	}

}
