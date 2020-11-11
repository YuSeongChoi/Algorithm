package algorithms;

import java.util.Scanner;

public class B2847 {
	private static int[] arr;
	
	public static void main(String[] args) {
		// 게임을 만든 동준이 - 그리디
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(n <= 1) {
			System.out.println(0);
		} else {
			int count = 0;
			
			for(int i = n-2; i>= 0; i--) {
				int high = arr[i+1];
				int low = arr[i];
				
				if(low >= high) {
					count += low - (high - 1);
					arr[i] = high - 1;
				}
			}
			System.out.println(count);
		}
	}
}
