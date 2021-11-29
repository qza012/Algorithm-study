https://programmers.co.kr/learn/courses/30/lessons/12916?language=java

```java
class Solution {
    boolean solution(String s) {
        
        int pCount = 0;
        int yCount = 0;
        
        int size = s.length();
        for (int i = 0; i < size; ++i) {
            char c = s.charAt(i);
            
            if (c == 'p' || c == 'P') {
                ++pCount;
            } else if (c == 'y' || c == 'Y') {
                ++yCount;
            }
        }

        return pCount == yCount;
    }
}
```
