https://programmers.co.kr/learn/courses/30/lessons/12949?language=java#

```java
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 3*2행렬 * 2*2행렬  =  3*2행렬
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int answerY = 0; answerY < arr1.length; answerY++) {
            for (int answerX = 0; answerX < arr2[0].length; answerX++) {
                for (int i = 0; i < arr2.length; i++) {
                    answer[answerY][answerX] += arr1[answerY][i] * arr2[i][answerX];
                }
            }
        }

        return answer;
    }
}
```
