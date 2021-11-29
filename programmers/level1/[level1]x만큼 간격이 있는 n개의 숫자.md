https://programmers.co.kr/learn/courses/30/lessons/12954?language=java

```java
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++) {
            answer[i] = (long)x * (i + 1); // int * int = int라서 오버플로우가 일어남. 그래서 long * int 로 바꿔서 계산함.
        }
        
        return answer;
    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        answer[0] = x;
        for(int i = 1; i < n; i++) {
            answer[i] = answer[i-1] + x;
        }
        
        return answer;
    }
}

```

시간 복잡도 : O(n)

직접 계산해서 넣어주거나 메모이제이션을 이용해서 풀 수 있다.
