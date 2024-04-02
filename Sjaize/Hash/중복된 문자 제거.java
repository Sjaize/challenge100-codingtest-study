// https://school.programmers.co.kr/learn/courses/30/lessons/120888
import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (char letter : my_string.toCharArray()) {
            if (set.contains(letter)) continue;
            set.add(letter);
            sb.append(letter);
        }
        
        return sb.toString();
    }
}
