https://programmers.co.kr/learn/courses/30/lessons/12924

```java
class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum = 0;
            
            for (int j = i; j <= n; j++) {
                sum += j;
                
                // n보다 커지면 탈출
                if (sum > n) {
                    break;
                }
                
                if (sum == n) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}
```
