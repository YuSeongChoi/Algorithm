package algorithms;

import java.util.Scanner;
import java.util.Stack;

public class B10773 {

	public static void main(String[] args) {
		// 제로 문제 <스택>
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int answer = 0;
		
		for(int i=0; i<size; i++) {
			int num = sc.nextInt();
			if(num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}
		
		while(!stack.empty()) {
			answer += stack.peek();
			stack.pop();
		}
		System.out.println(answer);
	}
}
