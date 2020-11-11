package Algorithms;

import java.util.Scanner;

public class B8958 {

	public static void main(String[] args) {
		// 구현 - OX 퀴즈
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		String[] arr = new String[test];
		
		for(int i=0; i<arr.length;i ++) {
			arr[i] = sc.next();
		}
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			int count = 0;
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}
