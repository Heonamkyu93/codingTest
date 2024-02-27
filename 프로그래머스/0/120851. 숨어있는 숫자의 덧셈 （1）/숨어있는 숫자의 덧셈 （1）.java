import java.util.*;
import java.util.regex.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        Pattern pattern = Pattern.compile("\\d"); 
        Matcher matcher = pattern.matcher(my_string);

        
        while (matcher.find()) {
            String number = matcher.group();
            answer+=Integer.parseInt(number);
        }
        
        return answer;
    }
}