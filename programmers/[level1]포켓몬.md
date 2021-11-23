https://programmers.co.kr/learn/courses/30/lessons/1845?language=java

```java
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int getCount = nums.length / 2;       
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // 뽑아야할 숫자 갯수 > 중복 된 숫자 갯수
        // 중복된 숫자의 갯수만큼 종류별로 뽑고나서,
        // 더 뽑아봤자 뽑은 종류의 수가 늘어나지는 않는다.
        if (getCount > set.size()) {
            return set.size();
        }
        
        return getCount;
    }
}
```
