https://programmers.co.kr/learn/courses/30/lessons/68935

```java
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 10 to 3진법
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            int remainder = n % 3;
            n /= 3;
            
            sb.insert(0, remainder);
            //sb.append(remainder); // append를 사용하면 앞뒤 반전을 다시 해줄 필요가 없어진다.
        }

        // 앞뒤 반전
        sb.reverse();

        // 3 to 10진법
        long num = Long.valueOf(sb.toString()); // int는 런타임에러가 발생해서 long으로 변환함.
        int count = 0;

        while (num > 0) {     
            // 1의 자리 숫자 * 3의 제곱들
            answer += (num % 10) * (int)Math.pow(3, count++);
            num /= 10;
        }
        
        return answer;
    }
}
```

다른 사람 풀이
```java
class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            sb.append((n % 3));
            n /= 3;
        }

        return Integer.parseInt(sb.toString(), 3);
    }
}
```
    
Integer의 parseInt()가 문자를 10진법으로 변환해줄 수 있다.
