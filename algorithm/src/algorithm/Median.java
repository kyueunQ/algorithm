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
		
		else if (a > c)	// a < b�� ��Ȳ  c < a < b  or  a < c < b
			return a;
		else if (b > c)	// a < c, b�� ��Ȳ   a < c < b  or  a < b < c
			return c;
		else
			return b;
			
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("�߾Ӱ��� " + med(23, 34, 25) + "�Դϴ�.");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �Է��ϸ�, �߾Ӱ��� ã���ٰԿ�!");
		System.out.println("ù��° ����: "); int a = sc.nextInt();
		System.out.println("�ι�° ����: "); int b = sc.nextInt();
		System.out.println("����° ����: "); int c = sc.nextInt();
		
		System.out.println("�� ���� �� �߾Ӱ��� " + med(a, b, c) + "�Դϴ�.");
		
		
	}

}
