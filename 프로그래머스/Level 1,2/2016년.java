class Solution {
  public String solution(int a, int b) {
      // 2016년의 일수 계산
      int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
      String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
      int numOfDays = 0;
      int today = 0;
      
      // 월 더하기
      for(int i=1; i<a; i++) {
          numOfDays += months[i-1];
      }
      // 일 더하기
      numOfDays += b-1;

      // 7로 나누기
      today = numOfDays % 7;
      String answer = days[today];
      
      return answer;
  }
}