package com.java.fortest;

import java.util.Scanner;

public class BaekJoon2439 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			for (int j=1; j<=N; j++) {
				if(j<=N-1) {
					System.out.println(" ");
				} else {
					System.out.println("*");
				}
			}
			
			System.out.println();
		}
		//sc.close();
	}

}
