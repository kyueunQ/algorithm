package com.java.arraytest;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액: "); int money = sc.nextInt();
		int[] arrMoney = new int[10];
		int value = 0;
		
		for (int i=50000; i>0; i=i/5) {
			
			
			value = money/i;
			money -= value*i;
			System.out.println(i + "원 : " + value + "개");
		}
		
		sc.close();
		
		
	}

}
