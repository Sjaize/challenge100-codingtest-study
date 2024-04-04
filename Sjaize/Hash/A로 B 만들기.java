// https://school.programmers.co.kr/learn/courses/30/lessons/120886
import java.util.Map;
import java.util.HashMap;

class Solution {
    private static Map<Character, Integer> toMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        return map;
    }
    
    public int solution(String before, String after) {
        return toMap(before).equals(toMap(after)) ? 1 : 0;
    }
}
