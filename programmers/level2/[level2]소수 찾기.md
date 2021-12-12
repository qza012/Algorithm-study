https://programmers.co.kr/learn/courses/30/lessons/42839

```java
import java.util.*;

class Solution {
    HashSet<Integer> nums = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        makeNumbers("", numbers);
        
        for (Integer i : nums) {
            if (isPrime(i)) {
                answer++;
            }
        }
        
        return answer;
    }

    void makeNumbers(String s, String others) {
        if (!"".equals(s)) {
            nums.add(Integer.parseInt(s));
        }
        
        for (int i = 0; i < others.length(); i++) {
            makeNumbers(s + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }
    
    boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        
        int size = (int)Math.sqrt(num);
        for (int i = 2; i <= size; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
```

