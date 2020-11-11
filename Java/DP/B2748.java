package algorithms;

import java.util.Scanner;

public class B2748 {
	private static long[] arr = new long[91];
	private static int n;

	public static void main(String[] args) {
		// 피보나치 수 2
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[n]);
	}
}
