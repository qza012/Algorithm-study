https://programmers.co.kr/learn/courses/30/lessons/12950?language=java

```java
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowLength = arr1.length;
        int columnLength = arr1[0].length;
        
        int[][] answer = new int [rowLength][columnLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
```

시간 복잡도 : O(n^2)
