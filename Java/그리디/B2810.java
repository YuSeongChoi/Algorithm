package Algorithms;

import java.util.Scanner;

public class B2810 {

	public static void main(String[] args) {
		//그리디 - 동준이네 영화관
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean[] cups = new boolean[num+1];
		int count = 0;
		boolean check = false;
		
		String str = sc.next();
		char[] people = str.toCharArray();
		
		for(int i=0; i<people.length;i ++) {
			if(people[i] == 'L') {
				if(!check) {
					check = true;
					cups[i+1] = true;
				} else {
					check = false;
				}
			}
			
			if(!cups[i]) {
				cups[i] = true;
				count++;
			} 
			else if(!cups[i+1]) {
				cups[i+1] = true;
				count++;
			}
		}	
		System.out.println(count);
	}
}
