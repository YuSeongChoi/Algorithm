public class Solution {
  public int solution(int n) {
      int answer = 0;
      
      //소수 판별 isPrime배열 선언 및 초기화
      boolean[] isPrime = new boolean[n+1];
      isPrime[0] = isPrime[1] = false;
      for(int i=1; i<=n; i++) {
          isPrime[i] = true;
      }
      
      //에라토니스의 체 사용
      for(int i=2; i*i<=n; i+=1) {
          for(int j=i*i; j<=n; j+=i) {
              isPrime[j] = false;
          }
      }
      
      //소수 출력
      for(int i=2; i<=n; i+=1) {
          if(isPrime[i] == true) {
              // System.out.println(i +" ");
              answer += 1;
          }
      }
      
      return answer;
  }
}