package algorithms;

import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		// 숫자의 갯수 구하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = a * b * c;
		int[] arr = new int[10];
		
		while(ans > 0) {
			arr[ans%10]++;
			ans /= 10;
		}
		
		for(int i=0; i<arr.length; i++) 
			System.out.println(arr[i]);
	}
}
