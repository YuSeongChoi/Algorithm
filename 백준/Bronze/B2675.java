package Algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 문자열 반복하기 (구현)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			char[] arr = s.toCharArray();
			
			for(int j=0; j<arr.length; j++) {
				for(int l=0; l<r; l++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println("");
		}
	}

}
