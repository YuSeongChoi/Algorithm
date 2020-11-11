package algorithms;

import java.util.Scanner;

public class B5597 {

	public static void main(String[] args) {
		// 과제 안내신 분?
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[30];
		
		for(int i=0; i<28; i++) {
			int num = sc.nextInt();
			arr[num-1] = true;
		}
		for(int i=0; i<30; i++) {
			if(!arr[i]) {
				System.out.println(i+1);
			}
		}
		
	}

}
