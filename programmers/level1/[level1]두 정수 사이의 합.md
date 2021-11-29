https://programmers.co.kr/learn/courses/30/lessons/12912?language=java

```java
class Solution {
    public long solution(int a, int b) {
        
        long sum = 0;
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        for (long i = a; i <= b; ++i) {
            sum += i;
        }
        
        return sum;
    }
}
```

```java
import java.util.stream.*;

class Solution {
    public long solution(int a, int b) {
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        return LongStream.rangeClosed(a, b).sum();
    }
}
```

다른 사람 풀이 참고
```java
import java.util.stream.*;

class Solution {
   public long solution(int a, int b) {
       
       if (a > b) {
           int temp = a;
           a = b;
           b = temp;
       }
       
       return (long)(b - a + 1) * (a + b) / 2;  // 등차수열 공식
    }
}
```

