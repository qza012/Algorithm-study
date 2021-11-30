https://programmers.co.kr/learn/courses/30/lessons/12909?language=java

```java
class Solution {
    boolean solution(String s) {
        int openCount = 0;
        
        char[] sArr = s.toCharArray();
        
        for (char c : sArr) {
            if (c == '(') {
                openCount++;
            } else {
                openCount--;
            }
                
            // openCount가 음수면, 올바르지 않은 괄호
            if (openCount < 0) {
                return false;
            }
        }
        
        // 모든 문자를 확인한 후 openCount가 양수면, 올바르지 않은 괄호
        if (openCount > 0) {
            return false;
        }
        
        return true;
    }
}
```
