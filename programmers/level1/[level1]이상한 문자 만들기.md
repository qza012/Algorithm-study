https://programmers.co.kr/learn/courses/30/lessons/12930?language=java

```java
class Solution {
    public String solution(String s) {        
        char[] sArray = s.toCharArray();
        
        int size = s.length();
        int count = 0; // 단어 안에서 각 알파벳의 index를 나타낸다.
        for (int i = 0; i < size; i++) {
            
            // 공백을 만나면 알파벳 index를 0으로 바꾼다.
            if(sArray[i] == ' ') {
                count = 0;
                continue;
            }
            
            // 단어 안에서 알파벳의 index를 판별
            if(count % 2 == 0) {
                sArray[i] = Character.toUpperCase(sArray[i]);
            } else {
                sArray[i] = Character.toLowerCase(sArray[i]);
            }
            ++count;
        }
        
        return new String(sArray);
    }
}
```
