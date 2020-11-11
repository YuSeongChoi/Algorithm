package algorithms;

import java.util.Scanner;

public class B15649 {
	private static int[] list;
	private static boolean[] check;
	private static int N;
	private static int M;

	public static void main(String[] args) {
		// N과 M (1) - 백트래킹
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		list = new int[9];
		check = new boolean[9];
		dfs(0);
	}
	
	public static void dfs(int num) {
		if(num == M) {
			for(int i=0; i<M; i++) {
				System.out.print(list[i] + " ");
			}
			System.out.println("");
			return;
		}
		
		for(int i=1; i<=N; i++) {
			if(check[i]) {
				continue;
			} else {
				check[i] = true;
				list[num] = i;
				dfs(num+1);
				check[i] = false;
			}
		}
	}

}
