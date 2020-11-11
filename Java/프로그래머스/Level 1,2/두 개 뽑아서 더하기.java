import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // int[] answer = {};
        Set<Integer> set = new HashSet<Integer>();
        boolean[] check = new boolean[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            check[i] = true;
            for(int j=0; j<numbers.length; j++) {
                if(check[j] != true) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}