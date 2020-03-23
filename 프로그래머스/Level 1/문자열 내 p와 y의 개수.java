class Solution {
    boolean solution(String s) {
        boolean answer = false;
        char[] arr = s.toCharArray();
        int numP, numY = 0;
        
        numP = numChar(arr,'p');
        numP += numChar(arr,'P');
        numY = numChar(arr,'Y');
        numY += numChar(arr, 'y');
        
        if(numP == numY) {
            answer = true;
        }
        if((numP == 0) && (numY == 0))
            answer = true;
        
        return answer;
    }
    
    int numChar(char[] arr, char c) {
        int num = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == c) {
                num++;
            }
        }
        
        return num;
    }
}