https://programmers.co.kr/learn/courses/30/lessons/64061?language=java#

```java
import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int m = 0; m < moves.length; m++) {           
            int move = moves[m];
            
            // 보드의 세로 길이만큼 반복
            for (int i = 0; i < board.length; i++) {               
                int num = board[i][move - 1];
                
                if (num != 0) {
                    board[i][move - 1] = 0;

                    // stack에 값이 들어있을 때, stack의 맨 위 값과 num이 같다면
                    if (!stack.isEmpty() && stack.peek().equals(num)) {
                        stack.pop();
                        answer += 2;
                        
                    } else {
                        stack.push(num);
                    }
                    
                    break;
                }
            }
            
        }
        
        return answer;
    }
}
```
