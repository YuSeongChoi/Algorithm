import java.util.*;

class Solution {
  public int[] solution(int[] arr) {
      // int[] answer = {};
      ArrayList list = new ArrayList<>();
      
      for(int i : arr) {
          list.add(i);
      }
      list.remove(Collections.min(list));
      
      if(list.size() != 0) {
         int[] answer = new int[list.size()];
             for(int i=0; i<list.size(); i++) {
                  answer[i] = (Integer)list.get(i);
             }
          return answer;
      }
      int[] answer = {-1};
      return answer;
  }
}