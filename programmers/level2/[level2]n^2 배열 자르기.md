https://programmers.co.kr/learn/courses/30/lessons/87390

```java
import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left + 1);
        int[] answer = new int[size];
        int count = 0;
        
        // 0,0  1,0  2,0
        // 0,1  1,1  2,1
        // 0,2  1,2  2,2
        
        for (long i = left; i <= right; i++) {
            int x = (int)(i % n);   // ex) 2번 index는  (2 / 3) = 0...2
            int y = (int)(i / n);
            
            answer[count++] = (int)Math.max(x, y) + 1;
        }

        return answer;
    }
}
```

첫 번째 시도  
2차원 배열의 수를 모두 구한 다음 left ~ right만큼만 잘라서 반환하려 했음     
시간 초과 또는 메모리 초과로 실패.    
    
이유  
n의 최대값이 n^7 이므로 2차원 배열의 값을 다 채우려면 최대 n^14(100조)번의 연산이 필요하다.   
cpu 클럭이 3.2GHz라면, 이 cpu는 32억/s의 연산속도를 가진다.  
100조 / 32억 = 31250, 즉 31250초가 소요된다.     
    
두 번째 시도(성공)     
2차원 배열을 좌표화 해서 구한다. 
1차원 배열을 일정한 수로 나누면 몫과 나머지가 각각 (y,x)로 나타난다.  
이 때, 연산은 right - left의 최대값인 10^5(10만)번 연산 횟수가 필요하다.     
3.2GHz의 cpu로, 10만 / 32억 = 31.25ms가 소요된다.
