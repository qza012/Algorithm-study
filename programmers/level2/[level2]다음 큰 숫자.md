https://programmers.co.kr/learn/courses/30/lessons/12911

```java
class Solution {
    public int solution(int n) {
        int answer = 0;
        int pivot = countOf1(n);
        
        while (true) {
            n++;
            
            // 1의 개수가 같으면 반환
            if (pivot == countOf1(n)) {
                return n;
            }
        }
    }
    
    private int countOf1(int n) {
        int count = 0;
        
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            
            n /= 2;
        }
        
        return count;
    }
}
```

Integer.bitCount(int)라는 함수가 존재한다.
