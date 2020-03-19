class Solution {
  public String solution(String phone_number) {
      int pLength = phone_number.length();
      char[] arr = phone_number.toCharArray();
      
      for(int i=0; i<pLength-4; i++) {
          arr[i] = '*';
      }
      String answer = String.valueOf(arr);
      return answer;
  }
}