package algorithms;

import java.util.Scanner;

public class B10952 {

	public static void main(String[] args) {
		// A+B ---5
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 ) {
				break;
			}else {
				System.out.println(a+b);
			}
		}
	}
}
