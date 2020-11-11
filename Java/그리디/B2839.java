package Algorithms;
import java.util.Scanner;

public class B2839 {
	static final int WEIGHT3 = 3;
	static final int WEIGHT5 = 5;

	public static void main(String[] args) {
		// 설탕 배달 문제 - 그리디
		Scanner sc = new Scanner(System.in);
		int kilo = 0;
		int count = 0;
		kilo = sc.nextInt();
		int quotient = kilo/WEIGHT5;
		int remainder = kilo%WEIGHT5;
		
		if( remainder == 0 ) {
			System.out.println(quotient);
			return;
		} else {
			for(; quotient>=0; quotient--) {
				int num = kilo - (quotient * 5);
				if(num % 3 == 0) {
					System.out.println(num/3 + quotient);
					return;
				}
			}
		}
		System.out.println(-1);
	}
}
