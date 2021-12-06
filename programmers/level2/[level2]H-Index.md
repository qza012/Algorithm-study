https://programmers.co.kr/learn/courses/30/lessons/42747#

```java
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            
            // citations[i] >= 현재 인덱스 이상으로 남아 있는 논문 개수
            if (citations[i] >= citations.length - i) {
                return citations.length - i;
            }
        }
        
        return 0;
    }
}
```
