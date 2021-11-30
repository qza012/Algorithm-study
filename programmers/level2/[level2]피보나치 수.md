https://programmers.co.kr/learn/courses/30/lessons/12945?language=java

```java
class Solution {
    public int solution(int n) {
        int[] arr = new int[n + 1];
        
        arr[0] = 0;
        arr[1] = 1;
        
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            
            if (arr[i] > 1234567) {
                arr[i] %= 1234567;
            }
        }
        
        return arr[n];
    }
}
```
