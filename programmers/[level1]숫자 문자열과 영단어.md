https://programmers.co.kr/learn/courses/30/lessons/81301

```java
import java.util.*;

class Solution {
    public int solution(String s) {
        
        // 영단어, 숫자
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        StringBuilder sb = new StringBuilder(s);
        StringBuilder answer = new StringBuilder();
        
        String tempString = "";        
        int size = sb.length();
        int start = 0;
        int end = 0;
        
        while (true) {
            
            // 자른 문자열이 영단어와 일치하면
            tempString = sb.substring(start, end);
            if (map.containsKey(tempString)) {
                
                // 영단어에 해당하는 숫자를 answer에 넣고,
                // start 인덱스를 end 인덱스로 맞추기
                answer.append(map.get(tempString));
                start = end;;
            }
            
            // end의 인덱스가 length보다 커지면 탈출
            if (size <= end) {
                break;
            }
            
            // end가 가리키는 인덱스가 문자가 아니면, 
            // end에 있는 숫자 answer에 추가하고
            // start의 인덱스를 end의 다음 문자로 맞추기
            if (!Character.isLetter(sb.charAt(end))) {
                answer.append(sb.charAt(end));
                start = end + 1;
            }
            
            // end 인덱스만 증가사키기
            end++;
        }

        return Integer.parseInt(answer.toString());
    }
}
```

다른 사람 풀이
```java
class Solution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
```
