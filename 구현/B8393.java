package algorithms;

import java.util.Scanner;

public class B8393 {

	public static void main(String[] args) {
		// 합 구하기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			answer += i;
		}
		
		System.out.println(answer);
		
	}

}
