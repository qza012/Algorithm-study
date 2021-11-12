https://programmers.co.kr/learn/courses/30/lessons/42748?language=java

```java
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int[] tempArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(tempArr);
            answer[i] = tempArr[commands[i][2] - 1];
        }
        
        return answer;
    }
}
```
