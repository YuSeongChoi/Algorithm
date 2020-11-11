package Algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2178 {
	static boolean[][] visited = new boolean[101][101];
	static int[][] maze = new int[101][101];
	static int N, M;
	
	public static void main(String[] args) {
		// 미로탐색 - BFS (Queue 이용) 미완 
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<M; j++) {
				maze[i][j] = str.charAt(j) - '0';
			}
		}
		
		Queue<Integer> qy = new LinkedList();
		Queue<Integer> qx = new LinkedList();
		Queue<Integer> qc = new LinkedList();
		qy.add(0);
		qx.add(0);
		qc.add(0);
		int count = 0;
		while(!qy.isEmpty()) {
			int cy = qy.remove();
			int cx = qx.remove();
			int cc = qc.remove();
			
			if(visited[cy][cx]) { continue; }
			visited[cy][cx] = true;
			
			
			if (cy == N-1 && cx == M-1) { 
				count = cc+1;
				break; 
			}
			
			//상
			if(check(cy-1, cx)) {
//				System.out.println("up : " + (cy-1) + " , " + cx);
				qy.add(cy - 1);
				qx.add(cx);
				qc.add(cc+1);
			}
			//하
			if(check(cy+1, cx)) {
//				System.out.println("down : " + (cy+1) + " , " + cx);
				qy.add(cy + 1);
				qx.add(cx);
				qc.add(cc+1);
			}
			//좌
			if(check(cy, cx-1)) {
//				System.out.println("left : " + cy + " , " + (cx-1));
				qy.add(cy);
				qx.add(cx-1);
				qc.add(cc+1);
			}
			//우
			if(check(cy, cx+1)) {
//				System.out.println("right : " + cy + " , " + (cx+1));
				qy.add(cy);
				qx.add(cx+1);
				qc.add(cc+1);
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean check(int y, int x) {
		if(y<0 | y>N | x<0 | x>M) { return false; }
		if(maze[y][x] == 0) { return false; }
		if(visited[y][x]) { return false; }
		return true;
	}
}
