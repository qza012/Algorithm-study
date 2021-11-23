https://programmers.co.kr/learn/courses/30/lessons/86051

```java
class Solution {
    public int solution(int[] numbers) {
        int sum0To9 = 45;
        int sum = 0;
        
        for (int i : numbers) {
            sum += i;
        }
        
        return sum0To9 - sum;
    }
}
```
