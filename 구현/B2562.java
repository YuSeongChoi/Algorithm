package Algorithms;
import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		// 최대값과 몇 번째 수인지 구하기
		int maxNum = 0;
		int order = 0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
				order = i + 1;
			}
		}
		
		System.out.println(maxNum);
		System.out.println(order);
	}

}
