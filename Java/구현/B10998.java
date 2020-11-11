package Algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10998 {

	public static void main(String[] args) throws IOException {
		// 곱셈 구해서 출력하기
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.write(a*b + "\n");
		bw.flush();
		bw.close();
	}
}
