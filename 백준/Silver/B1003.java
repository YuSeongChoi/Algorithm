package Algorithms;

import java.util.Scanner;

public class B1003 {
	private static int[][] arr = new int[41][2];
	
	public static void main(String[] args) {
		// 피보나치 함수(재귀)의 0과 1 호출 갯수
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		arr[0][0] = 1;
		arr[1][1] = 1;
		
		for(int i=2; i<41; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = arr[i-1][j] + arr[i-2][j];
			}
		}
		
		for(int i=0; i<test; i++) {
			int t = sc.nextInt();
			System.out.println(arr[t][0] + " " + arr[t][1]);
		}		
	}
}
