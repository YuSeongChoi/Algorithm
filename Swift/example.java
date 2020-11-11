package algorithms;

import java.util.Scanner;

public class B1072 {
	static long X, Y, Z;

	public static void main(String[] args) {
		// 게임 - 이진 탐색 알고리즘
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = (Y * 100) / X;
		
		if(Z >= 99) {
			System.out.println(-1);
		} else {
			binarySearch(1, X);
		}
	}
	
	public static void binarySearch(long start, long end) {
		long mid, ratio = 0;
		
		while(start <= end) {
			mid = (start + end) / 2;
			ratio = ((Y + mid) * 100) / (X + mid);
			
			if(ratio > Z) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(start);
	}
}
