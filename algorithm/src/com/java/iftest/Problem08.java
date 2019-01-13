package com.java.iftest;

import java.util.Scanner;

public class Problem08 {
	
	static int sum;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>"); int num = sc.nextInt();
			
			
			switch(num) {
			
				case 1:
					System.out.print("예금액>"); int add = sc.nextInt();
					System.out.println();
					sum += add;
					break;
				
				case 2:
					System.out.print("출금액>"); int minus = sc.nextInt();
					System.out.println();
					sum -= minus;
					break;
				
				case 3:
					System.out.print("잔고액>" + sum );
					break;
					
				case 4:
					System.out.println("프로그램 종료\n");
					break;
				
				default:
					System.out.println("다시입력해주세요\n");
					break;
			
			}
			
		}
		
	}
}
