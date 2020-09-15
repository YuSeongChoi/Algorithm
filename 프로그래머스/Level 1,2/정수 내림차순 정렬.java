import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int length = (int)(Math.log10(n)+1);
        String[] arr = new String[length];
        arr = Long.toString(n).split("");
        
        String tmp = "";
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<length; i++) {
            tmp+=(long)Integer.parseInt(arr[i]);
        }
        answer=Long.parseLong(tmp);
        
        return answer;
    }
}