https://programmers.co.kr/learn/courses/30/lessons/12948?language=java

```java
class Solution {
    public String solution(String phone_number) {
        char[] numbers = phone_number.toCharArray();
        
        int size = phone_number.length() - 4;
        for(int i = 0; i < size; i++) {
            numbers[i] = '*';
        }
        
        return String.valueOf(numbers);
    }
}
```
실행시간 : 평균 0.03ms

```java
class Solution {
    public String solution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
```
실행시간 : 평균 0.4ms


정규 표현식이 코드는 간단하지만 실행 시간이 더 많이 걸렸다.
