https://programmers.co.kr/learn/courses/30/lessons/12939?language=java

```java
import java.util.*;

class Solution {
    public String solution(String s) {
        String[] numStrings = s.split(" ");
        List<Integer> nums = new ArrayList<>();
        
        for (String num : numStrings) {
            nums.add(Integer.parseInt(num));
        }
        
        Collections.sort(nums);
        
        StringBuilder sb = new StringBuilder();
        sb.append(nums.get(0)); // 최솟값
        sb.append(" ");
        sb.append(nums.get(nums.size() - 1)); // 최댓값
        
        return sb.toString();
    }
}
```
