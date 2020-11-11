package algorithms;

import java.util.Scanner;

public class B1085 {

	public static void main(String[] args) {
		// 직사각형에서 탈출하기
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int width = w - x;
		int height = h - y;
		
		int min = (width < height) ? width : height;
		
		int pita = (int)Math.sqrt((width * width) + (height * height));
		int answer = (min < pita) ? min : pita;
		System.out.println(answer);
	}

}
