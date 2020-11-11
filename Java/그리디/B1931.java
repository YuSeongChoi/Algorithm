package Algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1931 {
	private static int[][] rooms;
	
	
	public static void main(String[] args) {
		// 백준 1931번 
		// 그리디 알고리즘 - 회의실 배
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		rooms = new int[num][2];
		
		for(int i=0; i<num; i++) {
			rooms[i][0] = sc.nextInt();
			rooms[i][1] = sc.nextInt();
		}
		
		//2차원 배열 종료시간 기준 정렬(오름차순)
		Arrays.sort(rooms, new Comparator<int[]>() {
			@Override
			public int compare(int[] start, int[] end) {
				if(start[1] == end[1]) {
					return Integer.compare(start[0], end[0]);
				}
				return Integer.compare(start[1], end[1]);
			}
		});
		
		int count = 0;
		int end = -1;
		
		for(int i=0; i<num; i++) {
			if(rooms[i][0] >= end) {
				end = rooms[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
