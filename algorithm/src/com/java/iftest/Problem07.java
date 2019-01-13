package com.java.iftest;

import java.util.Scanner;

public class Problem07 {
	
	public static void main(String[] args) {
		
		// Math.random()의 데이터타입은 double
		// 0~1사이 난수를 발생
		int num = (int)(Math.random()*100)+1;
		
		System.out.println("======================================");
		System.out.println("\t[숫자 맞추기 게임 시작]");
		System.out.println("======================================");
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(">>");int n = sc.nextInt();
			
			
			if (n == num) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>"); int yesno = sc.nextInt();
				
				if (yesno == 1) {
					break;
						
				} else {
					
					continue;
				}
			
			} else if (n > num) {
				
				System.out.println("더 낮게");
				continue;
				
			} else {
				
				System.out.println("더 높게");
				continue;
			} 
		} 
		System.out.println("======================================");
		System.out.println("\t [숫자 맞추기 게임 종료]");
		System.out.println("======================================");
	
		sc.close();
	}
	
	

}
