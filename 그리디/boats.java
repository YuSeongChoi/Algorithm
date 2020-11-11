package Algorithms;

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int length = people.length-1;
        int i=0;
        
        for(int j = length; i<=j; j--) {
            if(people[j] + people[i] > limit) {
                answer++;
            }
            else {
                answer++;
                i++;
            }
        }
        return answer;
    }
}