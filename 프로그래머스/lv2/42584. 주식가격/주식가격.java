import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
        int pricesLen = prices.length;
        int[] answer = new int[pricesLen];

        for (int i=0; i<prices.length; i++) {
            answer[i] = 0;
            for (int j=i+1; j<prices.length; j++) {
                answer[i]++;
                if (prices[j] < prices[i]) {
                    break;
                }
            }
        }

        return answer;
    }

}