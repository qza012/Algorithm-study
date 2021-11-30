https://programmers.co.kr/learn/courses/30/lessons/12951

```java
class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        char[] sArr = s.toCharArray();
        
        sArr[0] = Character.toUpperCase(sArr[0]);
        
        // 이전 문자가 공백이였다면, 현재 문자를 대문자로 바꿈.
        for (int i = 1; i < sArr.length; i++) {
            if (sArr[i - 1] == ' ') {
                sArr[i] = Character.toUpperCase(sArr[i]);
            }
        }
        
        return new String(sArr);
    }
}
```
