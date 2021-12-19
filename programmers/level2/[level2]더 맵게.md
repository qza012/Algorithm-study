https://programmers.co.kr/learn/courses/30/lessons/42626?language=java#

```java
import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int i : scoville) {
            minHeap.add(i);
        }
        
        while(true) {
            // 최소 값이 K보다 커지면 return
            if (minHeap.peek() >= K) {
                return count;
            }
            
            // 개수가 1개 이하면 탈출
            if (minHeap.size() < 2) {
                break;
            }
            
            ++count;
            Integer min1 = minHeap.poll();
            Integer min2 = minHeap.poll();
            
            minHeap.add(min1 + min2 * 2);
        }
        
        return -1;
    }
}
```
