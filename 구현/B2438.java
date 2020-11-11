package Algorithms;
import java.util.Scanner;
public class B2438 {

	public static void main(String[] args) {
		//입력받은 수 만큼 별을 찍어보자!
		Scanner scan = new Scanner(System.in);
		int loop;
		loop = scan.nextInt();
		
		for(int i=1; i<=loop; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
