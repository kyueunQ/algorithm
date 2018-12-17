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
	
	static int min3(int x, int y, int z) {
		
		int min = x;
		
		if (y<min)
			min = y;
		if (z<min)
			min = z;
		
		return min;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("max(2,3,4) = " + max3(2, 3, 4)); 
		System.out.println("max(5,2,2) = " + max3(5, 2, 2));
		
		System.out.println("min(4,6,2) = " + min3(4, 6, 2));
		System.out.println("min(1,1,5) = " + min3(1, 1, 5));
		
	}
	

}
