https://programmers.co.kr/learn/courses/30/lessons/42860

```java
class Solution {
    public int solution(String name) {
        int answer = 0;
        char[] arr = name.toCharArray();
        int ACount = 0;
        int changeCount = 0;
        
        // 위 또는 아래로 조이스틱 이동 횟수 구하기
        for (char c : arr) {
            int upCount = c - 'A';
            int downCount = 'Z' + 1 - c;
            
            if (c == 'A') {
                ACount = 0;
            }
            
            // 최솟값을 더해줌
            answer += Math.min(upCount, downCount);
        }
        
        changeCount = arr.length - ACount;
        
        int curIndex = 0;
        while (changeCount > 0) {
            changeCount--;

            for (int i = 0; i < arr.length; i++) {
                // 오른쪽으로 이동했을 때
                int r = (curIndex + i) % arr.length;

                if (arr[r] != 'A') {
                    arr[r] = 'A';
                    answer += i;
                    curIndex = r;
                    break;
                }
                
                // 왼쪽으로 이동했을 때
                int l = (curIndex >= i) ? (curIndex - i) : (arr.length - (i - curIndex));
                
                if (arr[l] != 'A') {
                    arr[l] = 'A';
                    answer += i;
                    curIndex = l;
                    break;
                }
            }
                
        }
        
        return answer;
    }
}
```
