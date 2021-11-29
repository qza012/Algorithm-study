https://programmers.co.kr/learn/courses/30/lessons/77484#fn1

```java
import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int equalNumCount = 0;

        for (int lotto : lottos) {
            // lotto에서 0의 갯수 세기
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            
            // 맞춘 갯수 세기
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    equalNumCount++;
                }
            }
        }
        
        // 등수 계산
        int best = 7 - (equalNumCount + zeroCount);
        int worst = 7 - (equalNumCount);
        
        // 맞춘 갯수 1개 부터는 6등으로 계산
        if (worst > 6) {
            worst = 6;
        }
        if (best > 6) {
            best = 6;
        }
        
        return new int[] {best, worst};
    }
}
```
