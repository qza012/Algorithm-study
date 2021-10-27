https://programmers.co.kr/learn/courses/30/lessons/12925?language=java

```java
class Solution {
    public int solution(String s) {

        if(s.charAt(0) == '+' || s.charAt(0) == '-') {
            String sNum = s.substring(1, s.length());
            int num = Integer.valueOf(sNum);
            
            return s.charAt(0) == '+' ? num : 0 - num;
        }
        
        return Integer.valueOf(s);
    }
}

// 다른 사람 풀이
class Solution {
    public int solution(String s) {
        return Integer.valueOf(s);
    }
}
```

Integer.valueOf(String)가 '+'나 '-'를 판단하지 못할줄 알았는데, 알아서 다 해준다...
