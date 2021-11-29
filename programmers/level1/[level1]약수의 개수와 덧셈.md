https://programmers.co.kr/learn/courses/30/lessons/77884

```java
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int num = left; num <= right; num++) {
            int divisorCount = 0;
            
            // 약수 구하기
            int length = (int)Math.sqrt(num);

            for (int j = 1; j <= length; j++) {
                int remainder = num % j;
                
                // 나누어 떨어지는지?
                if (remainder == 0) {
                    int share = num / j;
                    
                    // 몫과 나누려는 수가 같다면 1개만 더해주기
                    // ex) 4 * 4 = 16
                    if (share == j) {
                        divisorCount++;
                    } else {
                        divisorCount += 2;
                    }
                }
            }
            
            // 약수의 갯수에 따라 다르게 처리
            if (divisorCount % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        
        return answer;
    }
}
```
다른 사람 풀이  
```java
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}
```
