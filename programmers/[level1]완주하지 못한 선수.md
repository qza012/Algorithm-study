https://programmers.co.kr/learn/courses/30/lessons/42576
  
시간 초과 
```java
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> list = new ArrayList<>();
        
        for (String s : participant) {
            list.add(s);
        }
        
        for (String s : completion) {
            boolean success = list.remove(s);
            
            if (success == false) {
                return s;
            }
        }
        
        return list.get(0);
    }
}
```
성공  
```java
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        // <참가자, 동명이인 수>
        HashMap<String, Integer> list = new HashMap<>();
        
        for (String s : participant) {
            
            if (!list.containsKey(s)) {
                list.put(s, 1);
                continue;
            }
            
            list.put(s, list.get(s) + 1);
        }
        
        // 완주자 이름에 해당하는 참가자의 수를 HashMap에서 하나씩 뺀다.
        for (String s : completion) {
            list.put(s, list.get(s) - 1);
        }
        
        for (Map.Entry<String, Integer> e : list.entrySet()) {
            if (list.get(e.getKey()) != 0) {
                return e.getKey();
            }
        }
        
        return "";
    }
}
```
