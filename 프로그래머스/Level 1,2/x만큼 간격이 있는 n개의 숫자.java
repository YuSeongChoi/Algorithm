class Solution {
  public long[] solution(int x, int n) {
      long[] answer = new long[n];
      int length = answer.length;
      
      answer[0] = x;
      for(int i=1; i<length; i++) {
          answer[i] = answer[i-1] + x;
      }
      
      return answer;
  }
}