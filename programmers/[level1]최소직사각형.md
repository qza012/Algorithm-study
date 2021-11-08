https://programmers.co.kr/learn/courses/30/lessons/86491

```java
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 가로 길이에 큰 수들 몰아주기
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        // 가로 길이와 세로 길이에서 각각 큰 수 찾기
        int maxWidth = 0;
        int maxHeight = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (maxWidth < sizes[i][0]) {
                maxWidth = sizes[i][0];
            }
            
            if (maxHeight < sizes[i][1]) {
                maxHeight = sizes[i][1];
            }
        }
        
        return maxWidth * maxHeight;
    }
}
```

다른 사람 풀이
```java
class Solution {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}
```
