package Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class B1181 {

	public static void main(String[] args) throws IOException {
		// 단어 정렬 - 정렬문제 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> dict = new HashSet();
		
		for(int i=0; i<n; i++) {
			dict.add(br.readLine());
		}
		ArrayList<String> list = new ArrayList(dict);
		
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 길이 비교 우선 후 오름차순 정렬. 이 문제의 핵
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return Integer.compare(o1.length(), o2.length());
				}
			}
		});
		for(String s : list) System.out.println(s);
	}
}
