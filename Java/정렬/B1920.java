package Algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 수 찾기 문제 (이분 탐색)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		Arrays.sort(arr);
		
		for(int i=0; i<M; i++) {
			int n = Integer.parseInt(st.nextToken());
			System.out.println(binarySearch(arr, n));
		}
	}
	
	public static int binarySearch(int[] arr, int n) {
		int first = 0;
		int last = arr.length - 1;
		int mid = 0;
		
		while(first <= last) {
			mid = (first + last) / 2;
			if(n == arr[mid]) {
				return 1;
			} else {
				if(n < arr[mid]) {
					last = mid - 1;
				} else {
					first = mid + 1;
				}
			}			
		}
		return 0;
	}

}
