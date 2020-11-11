class Solution {
    public String solution(String number, int k) {
        // 블로그 참고
        StringBuilder sb = new StringBuilder();
        
        //@1
        int len = number.length();
        int remainNumber = len - k;
        int maxIdx = 0;
        
        while(remainNumber > 0) { //@2
            char maxChar = '0';
            for(int i=maxIdx; i<=len - remainNumber && maxChar != '9'; i++) { //@3
                if(number.charAt(i) > maxChar) { //@4
                    maxChar = number.charAt(i);
                    maxIdx = i;
                }
            }
            sb.append(maxChar);
            maxIdx++;
            remainNumber--;
        }
        return sb.toString();
    }
}