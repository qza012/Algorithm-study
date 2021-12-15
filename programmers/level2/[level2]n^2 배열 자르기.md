https://programmers.co.kr/learn/courses/30/lessons/87390

```java
import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[][] arrs = new int[n][n];
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            
            for (int j = 0; j <= i; j++) {
                arrs[i][j] = num;
                arrs[j][i] = num;
            }
        }

        int size = (int)(right - left + 1);
        int[] answer = new int[size];
        int answerIndex = 0;
        int count = 0;
        for (int[] arr : arrs) {
            for (int i : arr) {
                // count가 right보다 커지면 반환
                if (right < count) {
                    return answer;
                }
                
                // count가 left보다 클 때 부터 add
                if (left <= count) {
                    answer[answerIndex++] = i;
                }
                
                ++count;
            }
        }
        
        return new int[1];
    }
}
```
