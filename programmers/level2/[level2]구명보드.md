https://programmers.co.kr/learn/courses/30/lessons/42885

```java
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            
            right--;
            answer++;
        }
        
        return answer;
    }
}
```
