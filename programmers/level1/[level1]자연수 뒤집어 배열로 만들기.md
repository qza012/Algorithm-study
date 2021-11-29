https://programmers.co.kr/learn/courses/30/lessons/12932?language=java

```java
import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        // 10으로 나누면서 1의 자리 숫자를 배열로 담는다.
        List<Integer> nums = new ArrayList<Integer>();
        while (n != 0) {
            nums.add((int)(n % 10));
            n /= 10;
        }
        
        return nums.stream().mapToInt(i -> i).toArray();
    }
}
```
실행시간 : 1.8ms 정도

```java
import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        // 몇자리 수 인지 구한다.
        long num = n;
        int count = 0;
        while(num > 0) {
            num /= 10;
            count++;
        }
        
        // 자릿수 만큼 배열을 만든다.
        int[] nums = new int[count];
        
        // 10으로 나누면서, 1의 자리 숫자를 저장한다.
        int i = 0;
        num = n;
        while(num > 0) {
            nums[i++] = (int)(num % 10);
            num /= 10;
        }
        
        return nums;
    }
}
```
실행시간 : 0.02ms 정도   

```java
// 다른 사람 풀이
class Solution {
  public int[] solution(long n) {
        String a = "" + n; // String a = Long.toString(n)이 더 낫다.
                           // 기존 방식은 실행시간이 5.4ms 정도 걸리는 한편,위의 방식은 0.02ms가 걸린다.
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt++]=(int)(n%10);
            n/=10;
        }
      return answer;
  }
}
```
실행시간 : 5.4ms  
"" + n 부분이 시간을 많이 잡아먹는다.    
    
stream을 사용할 경우 boxing, unboxing으로 인해 시간이 더 걸린다.   
long의 자릿수를 구하기 위해서 10으로 몇번 나눠지는지 계산했었다.   
더 좋은 방법은 string으로 변환한 다음, 길이를 구하는 것.
