https://programmers.co.kr/learn/courses/30/lessons/42587?language=java

```java
import java.util.*;

class Solution {
    class Job {
        int num;
        int priority;
        
        Job(int num, int priority) {
            this.num = num;
            this.priority = priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int count = 0;
        Deque<Job> list = new ArrayDeque<>();
        Job destJob = null;
        
        // 문서 번호와 중요도를 저장.
        for (int i = 0; i < priorities.length; i++) {
            Job job = new Job(i, priorities[i]);
            list.add(job);
            
            if (i == location) {
                destJob = job;
            }
        }
        
        while (true) {
            Job temp = list.poll();
            count++;
            
            // 맨 앞의 작업이 제일 중요도가 높은지 확인
            if (isPriorityJob(list, temp)) {
                
                // 목표 작업과 첫 번째 위치한 작업의 번호가 같으면 return
                if (destJob.num == temp.num) {
                    return count;
                }
                
                continue;
            }
            
            // 중요도가 제일 높은게 아니라면
            // 맨 뒤로 작업을 밀어 넣기
            list.add(temp);
            // 출력한게 아니므로 count 줄이기
            count--;
        }
    }
    
    boolean isPriorityJob(Deque<Job> list, Job job) {
        for (Job j : list) {
            if (job.priority < j.priority) {
                return false;   
            }
        }
        return true;
    }
}
```
