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
                    sb = sb.deleteCharAt(i - 1);
                    --k;
                    break;
                }
            }
            
            loopCount++;
        }
        
        // k개 만큼 제거하지 못한 경우
        // 동일한 숫자들 끼리 비교해서 제거 ex) 99991
        loopCount = 0;
        maxCount = k;
        while (loopCount < maxCount) {
            int size = sb.length();
            for (int i = 1; i < size; i++) {
                if (sb.charAt(i) >= sb.charAt(i - 1)) {
                    sb = sb.deleteCharAt(i - 1);
                    --k;
                    break;
                }
            }
            
            loopCount++;
        }

        // k가 1개 남았다면
        // 맨 오른쪽에 있는 숫자를 제거.
        if (k == 1) {
            sb = sb.deleteCharAt(sb.length() - 1);
        }
        
        return sb.toString();
    }
}
```
