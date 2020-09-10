import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // String answer = "";
        ArrayList<String> participant_List =
            new ArrayList<String>(Arrays.asList(participant));
        ArrayList<String> completion_List =
            new ArrayList<String>(Arrays.asList(completion));
        
        for(String name : completion_List) {
            if(participant_List.contains(name)) {
                participant_List.remove(name);
            }
        }
        
        String answer = participant_List.get(0);
        
        return answer;
    }
}