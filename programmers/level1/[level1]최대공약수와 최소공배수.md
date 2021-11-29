https://programmers.co.kr/learn/courses/30/lessons/12940?language=java

```java
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        
        return gcd(b, a%b);
    }
}
```

유클리드 호제법(최대 공약수를 구하는 방법)을 이용하면 간단하다.

자연수 a와 b가 있다고 하자.
a>=b 일 때

'
a % b = r.
a = b
b = r
'
위의 식을 a % b == 0이 될때까지 반복해서, 최종적으로 나온 b의 값이 최대공약수.  
최소 공배수는 '최대공약수 * (a / 최대공약수) * (b / 최대공약수)'.  
즉, 최소 공배수 = a * b / 최대공약수


출처 : https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95
