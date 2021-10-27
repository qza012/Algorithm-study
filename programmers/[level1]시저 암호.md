https://programmers.co.kr/learn/courses/30/lessons/12926?language=java

```java
class Solution {
    public String solution(String s, int n) {
        
        char[] sArray = s.toCharArray();
        int size = s.length();
        for(int i = 0; i < size; i++) {
            sArray[i] = checkAlphabet(sArray[i], n);
        }
        
        return new String(sArray);
    }
    
    private char checkAlphabet(char c, int n) {
        final int alphabetCount = 26;
        
        if('a' <= c && c <= 'z') {
            // (c + n) <= 'z' ? (c + n) : ('a' + (n - ('z' - c));
            return (c + n) <= 'z' ? (char)(c + n) : (char)(n + c - alphabetCount);
        } else if('A' <= c && c <= 'Z'){
            // (c + n) <= 'Z' ? (c + n) : ('A' + (n - ('Z' - c)));
            return (c + n) <= 'Z' ? (char)(c + n) : (char)(n + c - alphabetCount);
        }
                  
        return c;
    }
}
```

아스키 코드 표를 참고해서 풀었다.   
알파벳 범위를 넘어가면, 초과한 갯수를 구하기 위해서 알파벳 갯수(26)만큼 빼주었다.
