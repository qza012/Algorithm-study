https://programmers.co.kr/learn/courses/30/lessons/12928?language=java#

```java
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                answer += i;
                
                int num = n / i;
                if(num != i) {
                    answer += n / i;
                }
            }
        }
        
        return answer;
    }
}
```

1부터 n까지 돌면서 나누어 떨어지는 것들을 구하는 것은 O(n)으로 효율성이 떨어진다.   
n의 제곱근을 초과하는 수들은 n이하의 약수들로 구할 수 있기 때문에, O(n^1/2)로 줄일 수 있다.
