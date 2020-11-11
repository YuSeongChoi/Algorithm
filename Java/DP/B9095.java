package algorithms;

import java.util.Scanner;

public class B9095 {
	static int[] arr;
	static int[] dp = new int[11];

	public static void main(String[] args) {
		// 1,2,3 ¥ı«œ±‚
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		arr = new int[t];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		dp[0] = dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=4; i<dp.length; i++) {
			dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(dp[arr[i]]);
		}
	}

}
