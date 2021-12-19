https://programmers.co.kr/learn/courses/30/lessons/42577?language=java

```java
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 사전순으로 정렬
        // ex) 112, 1133, 113345, 22, 56
        Arrays.sort(phone_book);
        
        int size = phone_book.length - 1;
        for (int i = 0; i < size; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}
```
