import java.util.*;

class Solution {
  public int[] solution(long n) {
      int[] answer = {};
      ArrayList<Integer> list = new ArrayList();
      long num = 0;
      
      while(n!=0) {
          num = n%10;
          list.add((int)num);
          n/=10;
      }
      
      answer = new int[list.size()];
      for(int i=0; i<list.size(); i++) {
          answer[i] = list.get(i);
      }
      
      return answer;
  }
}