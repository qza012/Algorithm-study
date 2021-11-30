https://programmers.co.kr/learn/courses/30/lessons/12953?language=java

```java
class Solution {
    public int solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 최소 공배수 = a * b / 최대공약수
            arr[i] = arr[i - 1] * arr[i] / gcd(arr[i - 1], arr[i]);
        }
        
        return arr[arr.length - 1];
    }
    
    // 유클리드 호제법 (최대 공약수 구하는 방법)
    private int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
}
```

주어진 배열에서 i번째와 i+1번째 수의 최소 공배수를 구한 후,   
구한 최소 공배수와 i+2번째 수의 최소 공배수를 구한다.   
위의 과정을 배열 안의 모든 수에서 반복 하면 모든 수의 최소 공배수가 나온다.
