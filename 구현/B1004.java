package Algorithms;
import java.util.Scanner;

public class B1004 {
	// 두 수를 입력받아서 나누는문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(num1 / num2);
	}
}
