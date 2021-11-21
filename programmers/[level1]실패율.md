https://programmers.co.kr/learn/courses/30/lessons/42889

```java
import java.util.*;

class Solution {
    
    class FailerRate {
        Integer stage;
        Float failerRate;
        
        FailerRate(Integer stage, Float failerRate) {
            this.stage = stage;
            this.failerRate = failerRate;
        }
    }
    
    public int[] solution(int N, int[] stages) {

        int[] notClearCount = new int[N + 1];    // 도달했으나 클리어 못한 플레이어 수
        int[] arrivalCount = new int[N + 1];     // 스테이지에 도달한 플레이어 수
        Set<FailerRate> failerRates = new TreeSet<>((a, b) -> {
            
            if (a.failerRate.equals(b.failerRate)) {
                return a.stage.compareTo(b.stage);
            }
            return b.failerRate.compareTo(a.failerRate);
        });
        
        for (int stage : stages) {
            
            // 각 스테이지에 도달했던 사람 수 세기
            for (int j = 0; j < stage; j++) {
                arrivalCount[j]++;
            }
            
            // 도달했으나 클리어하지 못한 사람 수 세기
            notClearCount[stage - 1]++;
        }
        
        // 실패율 계산
        for (int i = 0; i < N; i++) {
            if (arrivalCount[i] == 0 || notClearCount[i] == 0) {
                failerRates.add(new FailerRate(i + 1, 0.0f));
            } else{
                float failerRate = (float)notClearCount[i] / arrivalCount[i];
                failerRates.add(new FailerRate(i + 1, failerRate));
            }           
        }
        
        int i = 0;
        int[] answer = new int[failerRates.size()];
        for (FailerRate f : failerRates) {
            answer[i++] = f.stage;
        }

        return answer;
    }
    
}
```
