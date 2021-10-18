https://programmers.co.kr/learn/courses/30/lessons/12947?language=java#

```java
class Solution {
    public boolean solution(int x) {
        int num = x;       
        int sumOfDigit = 0;
        
        while(num != 0) {
            sumOfDigit += num % 10;
            num /= 10;
        }
        
        return x % sumOfDigit == 0;
    }
}
```
