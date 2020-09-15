package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class B5543 {

	public static void main(String[] args) {
		// 상근날드
		Scanner sc = new Scanner(System.in);
		int[] burgers = new int[3];
		int[] sides = new int[2];
		
		for(int i=0; i<burgers.length; i++) {
			burgers[i] = sc.nextInt();
		}
		for(int i=0; i<sides.length; i++) {
			sides[i] = sc.nextInt();
		}
		
		Arrays.sort(burgers);
		Arrays.sort(sides);
		System.out.println(burgers[0] + sides[0] - 50);
	}
}
