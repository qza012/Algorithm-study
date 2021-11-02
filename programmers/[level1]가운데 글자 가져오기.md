https://programmers.co.kr/learn/courses/30/lessons/12903?language=java

```java
class Solution {
    public String solution(String s) {

        int size = s.length();
        StringBuilder sb = new StringBuilder();
        
        if (size % 2 == 0) {
            sb.append(s.charAt(size / 2 - 1));
            sb.append(s.charAt(size / 2));
        } else {
            sb.append(s.charAt(size / 2));
        }
        
        return sb.toString();
    }
}
```

다른 사람 풀이
```java
class Solution {
    public String solution(String word) {

        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
}
```

String에서 제공하는 함수를 적극적으로 사용하자.
