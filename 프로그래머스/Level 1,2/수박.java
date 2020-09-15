public class Solution {
  public String solution(int n) {
      StringBuilder sb = new StringBuilder("");
      String su = "수";
      String bak = "박";
      
      for(int i=0; i< n; i++) {
          if(i % 2 == 0) {
              sb.append(su);
          }
          else 
              sb.append(bak);
      }
      String answer = sb.toString();
      return answer;
  }
}