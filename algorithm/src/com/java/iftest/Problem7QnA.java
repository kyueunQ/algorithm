package com.java.iftest;

import java.util.Scanner;

public class Problem7QnA {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임을 종료하시겠습니까?(y/n) >>"); String yesno = sc.nextLine();
		
		if ("yes".equals(yesno)) System.out.println("OK");
	}

}
