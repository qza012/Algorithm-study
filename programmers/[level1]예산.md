https://programmers.co.kr/learn/courses/30/lessons/12982?language=java

```java
import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        int answer = 0;
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            
            if (budget < 0) {
                break;
            }
            ++answer;
        }
        
        return answer;
    }
}
```

정렬 후 작은 값부터 빼다보면 지원 가능한 최대 수가 나온다.
