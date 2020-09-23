package algorithms;

import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		// 숫자의 합 구하기
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String num = sc.next();
		char[] arr = num.toCharArray();
		int answer = 0;
		
		for(int i=0; i<arr.length; i++) {
			answer += (int)arr[i] - '0';
		}
		
		System.out.println(answer);
	}

}
