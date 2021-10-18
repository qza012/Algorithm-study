https://programmers.co.kr/learn/courses/30/lessons/12944?language=java

```java
class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        
        // 기본 자료형 배열도 향상된 for문 사용 가능
        // for (int num : arr) {
        //     sum += num;
        // }
        
        return (double)sum / size;
    }
}
```

시간 복잡도 : O(n)
