// https://school.programmers.co.kr/learn/courses/30/lessons/43238
class Solution {
    private boolean isValid(long mid, int n, int[] times) {
        long k = 0;
        for (int time : times) {
            k = k + (mid / time);
        }
        return k >= n;
    }
    
    public long solution(int n, int[] times) {
        long start = 1;
        long end = 1000000000000000000L;
        
        while (end > start) {
            long mid = (start + end) / 2;
            
            if (isValid(mid, n, times)) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        
        return start;
    }
}
