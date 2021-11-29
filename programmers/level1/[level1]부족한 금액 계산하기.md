https://programmers.co.kr/learn/courses/30/lessons/82612?language=java

```java
class Solution {
    public long solution(int price, int money, int count) {
        
        // 합 구하기
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * price;
        }
        
        long margin = money - sum;
        if (margin < 0) {
            return -margin;
        }
        
        return 0;
    }
}
```

다른 사람 풀이
```java
class Solution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
```

연속된 합을 구할 땐, 등차수열 합 공식을 사용해 보자.
