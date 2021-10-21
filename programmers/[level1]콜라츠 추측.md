https://programmers.co.kr/learn/courses/30/lessons/12943?language=java

```java
class Solution {
    
    private static final int FAIL = -1;
    
    public int solution(int num) {

        long input = num;
        
        for (int answer = 0; answer < 500; answer++) {
            
            if (input == 1) {
                return answer;
            }
            
            input = (input % 2 == 0) ? (input / 2) : (input * 3 + 1);         
            
        }
        
        return FAIL;
    }
}
```

구현 문제.
주어진 수가 1이 될때까지 이므로, 1이 입력으로 들어오면 0을 반환해야 한다.
