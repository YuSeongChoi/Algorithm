package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B2798 {

	public static void main(String[] args) {
		// 블랙잭 알고리즘 - 브루트 포스
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		
		int ans = black(nums, N, M);
		System.out.println(ans);
		
		
	}
	
	public static int black(int[] arr, int n, int m) {
		int ans = 0;
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if(sum == m) {
						return sum;
					}
					if(ans < sum && sum < m) {
						ans = sum;
					}
				}
			}
		}
		
		return ans;
	}
	
}
