package algorithms;

import java.util.Scanner;

public class B9498 {

	public static void main(String[] args) {
		// Á¶°Ç¹®
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if((num < 101) && (num >= 90)) {
			System.out.println("A");
		} else if ((num < 90) && (num >= 80)) {
			System.out.println("B");
		} else if ((num < 80) && (num >= 70)) {
			System.out.println("C");
		} else if ((num < 70) && (num >= 60)) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
