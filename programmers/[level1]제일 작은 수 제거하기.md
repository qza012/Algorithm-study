https://programmers.co.kr/learn/courses/30/lessons/12935?language=java

```java
// 중복된 숫자가 있을 것이라고 가정했음.
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 최솟값 찾기
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (min > num) {
                min = num;
            }
        }
        
        // 중복된 최솟값이 몇 개 있는지 찾기
        int count = 0;
        for (int num : arr) {
            if (num == min) {
                count++;
            }
        }
        
        // 최솟값 갯수 == 입력값의 길이 라면, -1리턴
        if (count == arr.length) {
            return new int[] {-1};
        }
        
        // 최솟값 제외하고 배열 생성
        int[] answer = new int[arr.length - count];
        int j = 0;
        for(int num : arr) {
            if (num != min) {
                answer[j++] = num;
            }
        }
        
        return answer;
    }
}

// 다른 사람 풀이
// 중복된 숫자가 없을 것이라고 가정하고 푼 것 같음.
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}

```

시간 복잡도 : O(n)

stream을 사용하면 primitive 배열로 직접 처리하는 것보다 속도가 많게는 100배까지 더 느려졌다.   
하지만 stream은 소스 코드가 짧아져서 가독성을 향상시킨다.   
성능이 크게 중요하지 않다면, 가독성을 위해 stream이 더 나은 선택인 것 같다.
