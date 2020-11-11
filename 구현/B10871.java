package algorithms;

import java.util.Scanner;

public class B10871 {
	private static int[] arr;

	public static void main(String[] args) {
		// X보다 작은 수
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
