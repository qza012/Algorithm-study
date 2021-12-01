https://programmers.co.kr/learn/courses/30/lessons/12913?language=java

```java
class Solution {
    int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }

        int end = land.length - 1;
        return Math.max(Math.max(land[end][0], land[end][1]), Math.max(land[end][2], land[end][3]));
    }
}
```
  
DP 문제.  
각 열의 값이 최대가 될 수 있도록 구한다.  
마지막 행에서의 최댓값이 답이다.
