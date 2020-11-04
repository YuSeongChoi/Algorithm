package Algorithms;

import java.util.Scanner;

public class B1259 {

	public static void main(String[] args) {
		// 팰린드롬
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			if(num == flip(num)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
	
	public static int flip(int n) {
		int result = 0;
		while(n!=0) {
			result = result*10 + n%10;
			n /= 10;
		}
		return result;
	}
}
