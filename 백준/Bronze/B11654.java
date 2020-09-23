package algorithms;

import java.util.Scanner;

public class B11654 {

	public static void main(String[] args) {
		// 아스키 코드 출력하기
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char ch = str.charAt(0);
		System.out.println((int)ch);
	}
}
