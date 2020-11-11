package Algorithms;

import java.util.Scanner;

public class B1292 {
	private static int[] arr = new int[1001];
	
	public static void main(String[] args) {
		// 수학 - 구현 쉽게 푸는 문
		int num = 1;
		int count = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(count == num) {
				count = 0;
				num += 1;
			}
			arr[i] = num;
			count++;
		}
		
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int answer = 0;
		
		for(int i = start; i<=end; i++) {
			answer += arr[i];
		}
		System.out.println(answer);
	}
}
