package Algorithms;

import java.util.Scanner;
import java.util.Arrays;

public class B11399 {

	public static void main(String[] args) {
		// ATM 문제
		Scanner sc = new Scanner(System.in);
		int numberOfPeople = 0;
		int addTime = 0;
		int totalTime = 0;
		numberOfPeople = sc.nextInt();
		
		int[] times = new int[numberOfPeople];
		int[] addTimes = new int[numberOfPeople];
		for(int i=0; i<times.length; i++) {
			times[i] = sc.nextInt();
		}
		Arrays.sort(times);
		for(int i=0; i<times.length; i++) {
			addTime += times[i];
			addTimes[i] = addTime;
		}
		for(int i=0; i<addTimes.length;i++) {
			totalTime += addTimes[i];
		}
		System.out.println(totalTime);
	}
}
