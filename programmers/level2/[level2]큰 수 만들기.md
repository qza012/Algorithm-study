https://programmers.co.kr/learn/courses/30/lessons/42883?language=java#

```java
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(number);
        
        // 이전 숫자 < 현재 숫자
        // -> 이전 숫자를 제거
        int loopCount = 0;
        int maxCount = k;
        while (loopCount < maxCount) {
            int size = sb.length();
            for (int i = 1; i < size; i++) {
                if (sb.charAt(i) > sb.charAt(i - 1)) {
                    sb.deleteCharAt(i - 1);
                    --k;
                    break;
                }
            }
            
            loopCount++;
        }
 
        // 제거할 숫자들이 남았다면, 같은 숫자가 연속해서 존재한다는 것.
        // 맨 오른쪽부터 남은 수 만큼 제거해준다.
        // ex) 99991
        if(k!=0) {
            sb.delete(sb.length() - k, sb.length());
        }
        
        return sb.toString();
    }
}
```
