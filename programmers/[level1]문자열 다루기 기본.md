https://programmers.co.kr/learn/courses/30/lessons/12918?language=java

```java
class Solution {
    public boolean solution(String s) {
        
        int size = s.length();
        if (size != 4 && size != 6) {
            return false;
        }
        
        char c;
        for (int i = 0; i < size; ++i) {
            c = s.charAt(i);
            
            if (c < '0' ||  '9' < c) {
                return false;
            }
        }
        
        return true;
    }
}
```
