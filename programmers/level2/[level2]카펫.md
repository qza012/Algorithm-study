https://programmers.co.kr/learn/courses/30/lessons/42842

```java
class Solution {
    public int[] solution(int brown, int yellow) {
        int yellowWidth = 1;
        int yellowHeight = 1;
        
        // yellow가 가로로 길게 있는 것부터 시작
        int size = (int)Math.sqrt(yellow);
        for (; yellowHeight <= size; yellowHeight++) {
            // 사각형으로 만들 수 있는지 확인
            if (yellow % yellowHeight != 0) {
                continue;
            }
            
            yellowWidth = yellow / yellowHeight;
            
            int brownWidth = yellowWidth + 2;
            int brownHeight = yellowHeight + 2;
            int brownCount = brownWidth * 2 + brownHeight * 2 - 4;
            
            if (brownCount == brown) {
                return new int[] {brownWidth, brownHeight};
            }
        }
        
        
        return new int[] {-1, -1} ;
    }
}
```
