https://programmers.co.kr/learn/courses/30/lessons/12899?language=java#

```java
class Solution {
    public String solution(int n) {
        String s = toTernary(n);
        char[] sArr = s.toCharArray();
        char[] nation = new char[] {'4', '1', '2'};

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = nation[sArr[i] - '0'];
        }
        
        return new String(sArr);
    }
    
    private String toTernary(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.append(n % 3);
            n = (n - 1) / 3;
        }

        return sb.reverse().toString();
    }
}
```
3진법으로 1, 2, 4만 사용해야 한다는 것을 알겠으나..   
왜 몫에 -1을 해줘야하는지는 잘 이해가 가지 않는다.    
상세 설명 레퍼런스 : https://kis6473.tistory.com/66
