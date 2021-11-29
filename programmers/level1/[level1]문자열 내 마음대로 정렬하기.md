https://programmers.co.kr/learn/courses/30/lessons/12915?language=java

```java
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings.clone();  // 원본 데이터 변경 방지
        
        Arrays.sort(answer, (a, b) -> {     // 양수를 return 하면 a와 b의 위치를 바꿈
            if (a.charAt(n) > b.charAt(n)) {
                return 1;
            } else if (a.charAt(n) < b.charAt(n)) {
                return -1;
            }
            
            return a.compareTo(b);
        });
        
        return answer;
    }
}
```

Arrays.sort(배열, Comparator)
