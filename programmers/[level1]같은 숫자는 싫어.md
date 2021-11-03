https://programmers.co.kr/learn/courses/30/lessons/12906?language=java

```java
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> answerList = new ArrayList<>();

        int pivot = -1;
        for (int i : arr) {
            if(pivot != i) {
                answerList.add(i);
                pivot = i;
            }
        }
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
```
