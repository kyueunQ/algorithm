package algorithm;
import java.util.Scanner;

public class SmallBig {  
	
	static int max3(int a, int b, int c) {
		
		int max = a;
		
		if (b>max)
			max = b;
		if (c>max)
			max = c;
		
		return max;
		
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("max(2,3,4) = " + max3(2, 3, 4)); 
		System.out.println("max(5,2,2) = " + max3(5, 2, 2));
		
		
	}
	

}
