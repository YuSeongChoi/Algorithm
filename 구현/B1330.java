package Algorithms;
import java.util.Scanner;

public class B1330 {
	// 입력받은 두 수를 비교하는 프로그
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.print(">");
		} else if (num1 < num2) {
			System.out.print("<");
		} else {
			System.out.print("==");
		}
	}
}
