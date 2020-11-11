package algorithms;

import java.util.Scanner;

public class B1009 {
	static int[] arr;

	public static void main(String[] args) {
		// 분산 처리
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a,b,result;
		
		for(int j=0; j<t; j++) {
			a = sc.nextInt();
			b = sc.nextInt();
			result = 1;
			
			for(int i=0; i<b; i++) 
				result = (result*a)%10;
				if(result ==0)
					result = 10;
				System.out.println(result);
		}
		sc.close();
	}
}
