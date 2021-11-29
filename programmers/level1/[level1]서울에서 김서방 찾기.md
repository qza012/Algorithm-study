https://programmers.co.kr/learn/courses/30/lessons/12919?language=java

```java
class Solution {
    public String solution(String[] seoul) {
        
        int index = 0;
        int size = seoul.length;
        for (int i = 0; i < size; i++) {
            if ("Kim".equals(seoul[i])) {
                index = i;
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        sb.append(index);
        sb.append("에 있다");
        
        return sb.toString();
        // return "김서방은 " + index + "에 있다";
    }
}
```

'return "김서방은 " + index + "에 있다" '보다는 StringBuilder를 이용해서 출력하는 것이 훨씬 빠르다.
