package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B2751 {
	static int[] arr;

	public static void main(String[] args) {
		// 수 정렬하기 2 (O(nlongN)) - merge sort
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList();
		
		for(int i=0; i<N; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value: list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}


}
