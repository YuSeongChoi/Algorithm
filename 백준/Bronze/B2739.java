package Algorithms;
import java.util.Scanner;

public class B2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

}
