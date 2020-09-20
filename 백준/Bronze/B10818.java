package Algorithms;

import java.util.Scanner;
import java.util.Arrays;

public class B10818 {

	public static void main(String[] args) {
		// 최소 최대 문제
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[arr.length - 1]);
	}
}
