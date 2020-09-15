package Algorithms;

import java.util.Scanner;


public class B10162 {
	private static final int A = 300;
	private static final int B = 60;
	private static final int C = 10;
	static int[] times = new int[3];
	
	public static void main(String[] args) {
		// 전자 레인지
		Scanner sc = new Scanner(System.in);
		int inputTime = sc.nextInt();
		int count = 0;
		
		if(inputTime % C != 0) {
			System.out.println(-1);
			return;
		}
		if(inputTime / A > 0) {
			times[0] = inputTime / A;
			inputTime = inputTime % A;
		}
		if(inputTime / B > 0) {
			times[1] = inputTime / B;
			inputTime = inputTime % B;
		}
		if(inputTime / C > 0) {
			times[2] = inputTime / C;
			inputTime = inputTime % C;
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(times[i]+ " ");
		}
	}
}
