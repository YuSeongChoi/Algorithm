package Algorithms;
import java.util.Scanner;

public class B11047 {

	public static void main(String[] args) {
		// 동전 0 - 그리디
		Scanner sc = new Scanner(System.in);
		int N, K = 0;
		N = sc.nextInt();
		K = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int money = K;
		int count = 0;
		int size = arr.length-1;
		while(money != 0) {
			
			if((money / arr[size]) > 0) {
				count += money / arr[size];
				money = money % arr[size];
			}
			if(size > 0) 
				size--;
		}
		System.out.println(count);
	}
}
