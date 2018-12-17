package algorithm;
import java.util.Scanner;

public class Median {
	
	static int med(int a, int b, int c) {
		
		if (a >= b)  
			if (b >= c) 	// a >= b >= c
				return b;
			else if (a <= c)	// b <= a < c
				return a;
			else
				return c;
		
		else if (a > c)	// a < b인 상황  c < a < b  or  a < c < b
			return a;
		else if (b > c)	// a < c, b인 상황   a < c < b  or  a < b < c
			return c;
		else
			return b;
			
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("중앙값은 " + med(23, 34, 25) + "입니다.");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수를 입력하면, 중앙값을 찾아줄게요!");
		System.out.println("첫번째 숫자: "); int a = sc.nextInt();
		System.out.println("두번째 숫자: "); int b = sc.nextInt();
		System.out.println("세번째 숫자: "); int c = sc.nextInt();
		
		System.out.println("세 숫자 중 중앙값은 " + med(a, b, c) + "입니다.");
		
		
	}

}
