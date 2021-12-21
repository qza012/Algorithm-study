https://programmers.co.kr/learn/courses/30/lessons/42586?language=java

```java
import java.util.*;

class Solution {
    class Job {
        int progress;
        int speed;
        
        Job(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }
    }
    
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        Deque<Job> list = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++) {
            list.add(new Job(progresses[i], speeds[i]));
        }
        
        while (!list.isEmpty()) {
            int jobCount = 0;
            
            // 완료까지 걸린 날 계산
            int day = 0;
            Job job = list.peek();
            for (int i = job.progress; i < 100; i += job.speed) {
                day++;
            }
            
            // 앞에서부터 완료된 작업이 있는지 계산
            while (!list.isEmpty() && list.peek().progress + list.peek().speed * day >= 100) {
                list.poll();
                jobCount++;
            }
            
            answer.add(jobCount);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
```
