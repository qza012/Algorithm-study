https://programmers.co.kr/learn/courses/30/lessons/68644?language=java

```java
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        return list.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }
}
```

```java
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> list = new TreeSet<>(); // 자동 정렬 Set
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
```
HashSet은 자동 정렬 기능이 없다.  
TreeSet은 자동 정렬을 해준다.(레드 블랙 트리)  
set으로 중복을 거르는 것이 대체로 1.5배 정도 더 빨랐다.
