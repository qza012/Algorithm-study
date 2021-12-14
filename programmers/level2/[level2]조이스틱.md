https://programmers.co.kr/learn/courses/30/lessons/42860

```java
class Solution {
    public int solution(String name) {
        int answer = 0;
        char[] arr = name.toCharArray();
        
        // 위 또는 아래로 조이스틱 이동 횟수 구하기
        for (char c : arr) {
            int upCount = c - 'A';
            int downCount = 'Z' + 1 - c;
            
            // 최솟값을 더해줌
            if (upCount > downCount) {
                answer += downCount;
                continue;
            }
            
            answer += upCount;
        }
        
        // 왼쪽으로 이동이 좋은지, 오른쪽으로 이동이 좋은지 비교
        int RLCount = 0;
        int ARightCount = 0;
        int ALeftCount = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 'A') {
                break;
            }
            ARightCount++;
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 'A') {
                break;
            }
            ALeftCount++;
        }
        
        if (ARightCount > ALeftCount) {
            RLCount = arr.length - 1 - ARightCount;
        } else {
            RLCount = arr.length - 1 - ALeftCount;
        }
        
        return answer + RLCount;
    }
}
```
