https://programmers.co.kr/learn/courses/30/lessons/12977

```java
import java.util.*;

class Solution {

    public int solution(int[] nums) {
        int answer = 0;

        // 최대 2997까지 가능하다.
        int maxNum = 2997;
        boolean[] primeNumbers = new boolean[maxNum + 1];

        // '에라토스테니스의 체'로 소수 구하기
        int size = (int)Math.sqrt(maxNum);
        for (int i = 2; i <= size; i++) {
            
            if (primeNumbers[i] == true) {
                continue;
            }
            
            for (int j = i * i; j <= maxNum; j += i) {
                primeNumbers[j] = true;
            }
        }
        
        // 소수인지 판별, 해당 index가 false라면 소수다.
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    
                    if (primeNumbers[nums[i] + nums[j] + nums[k]] == false) {
                        ++answer;
                    }
                }
            }
        }

        return answer;
    }
}
```

소수 구하기 참고 자료 : https://st-lab.tistory.com/81
