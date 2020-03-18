class Solution {
  public boolean solution(String s) {
      boolean answer = false;
      
      answer = isLength(s);
      if(answer == true) {
        answer = isInteger(s);
      }
      
      return answer;
  }
    //문자열 숫자 체크
    public boolean isInteger(String s) {
        try {
           Integer.parseInt(s);
           return true;
        } catch(Exception e) {
            return false;
        }
    }
    //문자열 길이 체크
    public boolean isLength(String s) {
        if((s.length() == 4) || (s.length() == 6)) {
            return true;
        } 
        return false;
    }
}