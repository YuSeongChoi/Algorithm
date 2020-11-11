//Internet code

class Solution {
    public String solution(String s, int n) {
        // String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if(isAlpha(arr[i])) {
                arr[i] += n;
            }
            if((isUpperError(arr[i])) || (isLowerError(arr[i]))) {
                arr[i] -= 26;
            }
            // System.out.println(arr[i]);
        }
        
        String answer = String.valueOf(arr);
        
        return answer;
    }
    
    public boolean isAlpha(char n) {
        boolean fact = false;
        
        if((n>=65) && (n<=90)) {
            fact = true;
        }
        if((n>=97) && (n<=122)) {
            fact = true;
        }
        return fact;
    }
    
    public boolean isUpperError(char n) {
        boolean fact = false;
        
        if((n>=91) && (n<=96)) {
            fact = true;
        }
        return fact;
    }
    
    public boolean isLowerError(char n) {
        boolean fact = false;
        
        if(n>=122) {
            fact = true;
        }
        return fact;
    }
}