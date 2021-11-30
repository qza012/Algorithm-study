https://programmers.co.kr/learn/courses/30/lessons/12941

```java
import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);

        // A는 제일 작은 수부터, B는 제일 큰 수부터
        // 곱하다보면 최솟값이 나온다.
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }
        
        return answer;
    }
}
```
