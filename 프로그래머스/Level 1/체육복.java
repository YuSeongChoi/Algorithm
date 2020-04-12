class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count = 0;
        
        answer = n - lost.length;
        
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -9;
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if((lost[i] - reserve[j] == 1) || 
                   (lost[i] - reserve[j] == -1)) {
                    lost[i] = -9;
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }
        answer += count;
        
        return answer;
    }
}