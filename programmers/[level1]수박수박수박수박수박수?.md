https://programmers.co.kr/learn/courses/30/lessons/12922?language=java

```java
1
class Solution {
    public String solution(int n) {
        
        char[] word = new char[] {'수', '박'};
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(word[i%2]);
        }
        
        return sb.toString();
    }
}
```
걸린시간 범위 : 0.04ms ~ 0.93ms   
    
    
```java
2
class Solution {
    public String solution(int n) {
        
        String word = "수박";
        
        StringBuilder sb = new StringBuilder();
        int size = n / 2;
        for (int i = 0; i < size; i++) {
            sb.append(word);
        }
        
        if (n % 2 == 1) {
            sb.append(word.charAt(0));
        }
        
        return sb.toString();
    }
}
```
걸린시간 범위 : 0.06ms ~ 0.56ms

n이 작으면 1의 방법이 낫겠지만,   
n이 커질수록 2의 방법처럼 단어 단위로 나누는 것이 더 낫다.
