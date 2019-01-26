package com.java.arraytest;

import java.util.Scanner;

public class BaekJoon1152 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String clause = sc.nextLine().trim();
		
		String word[] = clause.split(" ");
		
		
		System.out.println((clause.isEmpty())? 0 : word.length);
		
	}

}
