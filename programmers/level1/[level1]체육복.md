https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
  
오답 2개 + 런타임 에러 1개 
```java
import java.util.*;

class Solution {
    
    private int maxCount = 0;
    
    public int solution(int n, int[] lost, int[] reserve) {

        int[] list = new int[n];
        
        for (int i : lost) {
            list[i - 1]--;
        }
        
        for (int i : reserve) {
            list[i - 1]++;
        }     
        
        rent(list, 0);
        
        return this.maxCount;
    }
    
    private void rent(int[] list, int curIndex) {
        // 맨 마지막 인덱스에 도착하면 탈출
        if (list.length - 1 == curIndex) {
            
            int count = 0;
            for (int i : list) {
                if (i >= 0) {
                    ++count;
                }
            }
            
            if (this.maxCount < count) {
                this.maxCount = count;
            }

            return;
        }

        for(int i : list) {
            System.out.print(i);
        }
        System.out.println(", " + curIndex);
        
        if (list[curIndex] == 1) {

            // 왼쪽이 -1이라면 왼쪽에게 빌려주기
            if (curIndex - 1 >= 0 && list[curIndex - 1] == -1) {
                int[] tempList = Arrays.copyOf(list, list.length);
                tempList[curIndex]--;
                tempList[curIndex - 1]++;

                rent(tempList, ++curIndex);
            }

            // 오른쪽이 -1이라면 오른쪽에게 빌려주기
            if (curIndex + 1 < list.length && list[curIndex + 1] == -1) {
                int[] tempList = Arrays.copyOf(list, list.length);
                tempList[curIndex]--;
                tempList[curIndex + 1]++;
                
                rent(tempList, ++curIndex);
            }
        }
        
        // 빌려주는거 없이 진행
        rent(list, ++curIndex);
    }
}
```
성공  
```java
import java.util.*;

class Solution {

    public int solution(int n, int[] lost, int[] reserve) {

        int[] list = new int[n];
        
        for (int i : lost) {
            list[i - 1]--;
        }
        
        for (int i : reserve) {
            list[i - 1]++;
        }     

        for (int i = 0; i < n; i++) {
            
            // 여분이 존재한다면
            if (list[i] == 1) {
                
                // 왼쪽에 빌려주기
                if (i - 1 >= 0 && list[i - 1] == -1) {
                    list[i]--;
                    list[i - 1]++;
                    
                // 오른쪽에 빌려주기
                } else if (i + 1 < list.length && list[i + 1] == -1) {
                    list[i]--;
                    list[i + 1]++;
                }
            }

        }
        
        int answer = 0;
        for (int i : list) {
            if (i > -1) {
                answer++;  
            }
        }
        
        return answer;
    }
}
```
완전 탐색으로 최댓값을 구하려했지만 실패.   
탐욕법으로 최댓값을 구하니 정답.  
    
첫 번째 풀이는 왜 2개의 오답이 뜨는지 잘 모르겠다.
