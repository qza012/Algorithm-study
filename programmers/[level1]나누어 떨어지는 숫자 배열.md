https://programmers.co.kr/learn/courses/30/lessons/12910?language=java

```java
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> answer = new ArrayList<>();
        
        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }
        
        answer.sort(Comparator.naturalOrder());
        
        return answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

다른 사람 풀이
```java
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] answer = Arrays.stream(arr).filter( i -> i % divisor == 0).toArray();
        
        if (answer.length == 0) {
            return new int[] {-1};
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
```

stream을 적극 사용해보자
