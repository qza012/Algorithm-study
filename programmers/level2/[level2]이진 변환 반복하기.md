https://programmers.co.kr/learn/courses/30/lessons/70129?language=java

```java
class Solution {
    public int[] solution(String s) {
        return toBinary(s, 0, 0);
    }
    
    private int[] toBinary(String s, int runCount, int removedZeroCount) {
        if ("1".equals(s)) {
            return new int[] {runCount, removedZeroCount};
        }
        
        char[] arr = s.toCharArray();
        String binary = "";
        int zeroCount = 0;
        
        for (char c : arr) {
            if (c == '0') {
                zeroCount++;
            }
        }
        
        binary = Integer.toBinaryString(arr.length - zeroCount);
        
        return toBinary(binary, ++runCount, removedZeroCount + zeroCount);
    }
}
```
