package Algorithms;

import java.util.Scanner;

public class B1541 {

	public static void main(String[] args) {
		// 그리디 알고리즘 - 잃어버린 괄호
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = str.split("\\-");
		
		int plus = 0;
		int minus = 0;
		
		String[] first = arr[0].split("\\+");
		for(int i=0; i<first.length; i++) {
			plus += Integer.parseInt(first[i]);
		}
		
		for(int i=1; i<arr.length; i++) {
			String[] arrMinus = arr[i].split("\\+");
			for(int j=0; j<arrMinus.length; j++) {
				minus += Integer.parseInt(arrMinus[j]);
			}
		}
		System.out.println(plus - minus);
	}
}
