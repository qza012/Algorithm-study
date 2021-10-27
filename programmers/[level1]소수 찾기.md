

```java
import java.util.*;

class Solution {
    
    private List<Integer> list = new ArrayList<>(); // 소수들 담을 곳
    
    public int solution(int n) {
        int count = 0;
        
        for (int i = 2; i <= n; i++) {
            if (!isPrimeNumber(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isPrimeNumber(int n) {
        for (Integer i : list) {
          
            // 1. n의 제곱근을 초과한 수는 나누어 떨어질 수가 없다. (계산 수를 줄일 수 있다.)
            if(i * i > n) {
                break;
            }
          
            if (n % i == 0) {
                return true;
            }
        }
        
        list.add(n);
        return false;
    }
}
```
    
처음에는 메모이제이션을 사용해서 계산 횟수를 충분히 줄였다고 생각했었지만,    
isPrimeNumber(int)에서 1.번 부분을 작성하지 않고 제출했더니 효율성 테스트에서 실패했다. O(n)    
isPrimeNumber(int) 부분을 O(n^1/2)로 줄이니 통과했다.
