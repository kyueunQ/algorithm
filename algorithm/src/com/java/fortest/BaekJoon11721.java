package com.java.fortest;

import java.util.Scanner;

public class BaekJoon11721 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word[] = sc.nextLine().split("");
		
		for (int i=0; i<word.length; i++) {
			
			System.out.print(word[i]);
			if((i+1)%10 == 0) {
				System.out.println();
			}
		}
		
	}

}
