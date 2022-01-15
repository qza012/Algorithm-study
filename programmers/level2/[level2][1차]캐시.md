https://programmers.co.kr/learn/courses/30/lessons/17680

```java
import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new LinkedList<>(); 
        
        for (String city : cities)
        {
            if (isCacheHit(cache, cacheSize, city)) {
                answer++;
                continue;
            }
            
            answer += 5;
        }
        
        return answer;
    }
    
    boolean isCacheHit(List<String> cache, int maxCacheSize, String city) {
        if (maxCacheSize == 0) {
            return false;
        }
        
        for (String c : cache) {
            city = city.toLowerCase();
            
            // cache hit
            if (c.toLowerCase().equals(city)) {
                
                cache.remove(c);
                cache.add(c);
                
                return true;
            }
        }
        
        if (cache.size() == maxCacheSize) {
            cache.remove(0);
        }
        
        cache.add(city);
        
        return false;
    }
    
}
```
