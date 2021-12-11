https://programmers.co.kr/learn/courses/30/lessons/42584?language=java

```java
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                
                //이전 price > 현재 prices
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }
        
        return answer;
    }
}
```
