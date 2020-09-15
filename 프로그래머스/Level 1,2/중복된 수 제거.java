import java.util.*;

public class Solution {
    
	public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //  마지막 배열 원소를 예외처리 해줘야함(ArrayBoundException)
        for(int i=0; i<arr.length; i++) {
            if(i == arr.length-1) {
                list.add(arr[i]);
                break;
            }
            if(arr[i] != arr[i+1]) {
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    	
    }
}