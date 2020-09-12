package algorithms;

import java.util.Scanner;
import java.util.Arrays;

public class B2750 {
	static int[] arr;

	public static void main(String[] args) {
		// 수 정렬하기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
