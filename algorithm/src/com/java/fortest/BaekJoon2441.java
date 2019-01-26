package com.java.fortest;

import java.util.Scanner;

public class BaekJoon2441 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<N; i++) {
			for(int j=N; j<0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
