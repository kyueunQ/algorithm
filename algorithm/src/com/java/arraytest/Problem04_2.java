package com.java.arraytest;

import java.util.Scanner;

public class Problem04_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int[] separateMoney = new int[10];
		separateMoney[0] = 50000;
		
		for (int i=0; i<separateMoney.length;i++) {
			int value = 0;
			value = money/separateMoney[i];
			money -= value*separateMoney[i];
			System.out.println(separateMoney[i] + "원:" + value +"개");
			
			if (i == separateMoney.length-1) break;
			
			if((i+1)%2 != 0) {
				separateMoney[i+1] = separateMoney[i]/5;
			} else {
				separateMoney[i+1] = separateMoney[i]/2;
			} 
		
		}
	}

}
