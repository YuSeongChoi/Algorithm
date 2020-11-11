package algorithms;

import java.util.Scanner;

public class B10872 {
	private static int answer = 1;
	
	public static void main(String[] args) {
		// N ���丮�� ����ϱ�!
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N < 1) {
			System.out.println(1);
		} else {
			factorial(N);
		}
		
	}
	
	public static void factorial(int n) {
		if(n == 1) {
			System.out.println(answer);
		} else {
			answer = answer * n;
			factorial(n-1);
		}
	}
}
