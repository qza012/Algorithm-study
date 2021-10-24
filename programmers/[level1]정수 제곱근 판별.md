https://programmers.co.kr/learn/courses/30/lessons/12934?language=java#

```java
import java.lang.Math;

class Solution {
    public long solution(long n) {
        
        int size = (int)Math.sqrt(n) + 1;
        for (long i = 1; i < size; i++) {
            if((i * i) == n) {
                return (i + 1) * (i + 1);
            }
        }
        
        return -1;
    }
}
```

시간 복잡도 : O(n)

입력 값 n의 양의 제곱근을 초과한 수들의 제곱은 무조건 n보다 크기 때문에, for문이 도는 횟수를 줄일 수 있다.
