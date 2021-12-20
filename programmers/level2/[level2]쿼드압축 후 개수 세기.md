https://programmers.co.kr/learn/courses/30/lessons/68936

```java
class Solution {
    class Count {
        int zero;
        int one;
        
        Count() {}
        
        Count add(Count count) {
            this.zero += count.zero;
            this.one += count.one;
            return this;
        }
    }
    
    public int[] solution(int[][] arr) {
        Count count = quadCompression(arr, 0, 0, arr.length);
        
        return new int[] {count.zero, count.one};
    }
    
    Count quadCompression(int[][] arr, int xStart, int yStart, int length) {
        Count count = new Count();
        
        if (isPerfect(arr, xStart, yStart, length)) {
            if (arr[yStart][xStart] == 0) {
                count.zero++;
            } else {
                count.one++;
            }
                
            return count;
        }

        int halfLenfth = length / 2;
        
        // 왼쪽 위
        count.add(quadCompression(arr, xStart, yStart, halfLenfth));
        // 오른쪽 위
        count.add(quadCompression(arr, xStart + halfLenfth, yStart, halfLenfth));
        // 왼쪽 아래
        count.add(quadCompression(arr, xStart, yStart + halfLenfth, halfLenfth));
        // 오른쪽 아래
        count.add(quadCompression(arr, xStart + halfLenfth, yStart + halfLenfth, halfLenfth));
        
        return count;
    }
    
    boolean isPerfect(int[][] arr, int xStart, int yStart, int length) {
        int temp = arr[yStart][xStart];
        int yEnd = yStart + length;
        int xEnd = xStart + length;
            
        for (int y = yStart; y < yEnd; y++) {
            for (int x = xStart; x < xEnd; x++) {
                if (temp != arr[y][x]) {
                    return false;
                }
                
                temp = arr[y][x];
            }
        }
        
        return true;
    }
}
```
