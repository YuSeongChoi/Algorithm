package algorithms;

import java.util.Scanner;

public class B1463 {

	public static void main(String[] args) {
		// 1�� �����
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dp[] = new int[num+1];
		dp[1] = 0;
		
		for(int i=2; i<=num; i++) {
			dp[i] = dp[i-1] + 1;
			
			if(i % 2 == 0) {
				if(dp[i] > dp[i/2] + 1 )
					dp[i] = dp[i/2] + 1;
			}
			
			if(i % 3 == 0) {
				if(dp[i] > dp[i/3] + 1)
					dp[i] = dp[i/3] + 1;
			}
		}
		System.out.println(dp[num]);
	}
}