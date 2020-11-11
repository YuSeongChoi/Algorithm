package Algorithms;
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] result = new String[numbers.length];
        
        // 숫자를 문자열로 변환
        for(int i=0; i<numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }
        
        // 정렬(overried)
        Arrays.sort(result, new Comparator<String>() {
           @Override
			public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
			}
        });
        
        // 0이 여러개 있을경우 예외처리
        if(result[0].equals("0")) {
            return "0";
        }
        
        for(String a: result) {
            answer += a;
        }
        return answer;
    }
}