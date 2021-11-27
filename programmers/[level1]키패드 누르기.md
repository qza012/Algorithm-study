https://programmers.co.kr/learn/courses/30/lessons/67256?language=java

```java
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        final char left = 'L';
        final char right = 'R';
        
        int[] leftHandNums = new int[] {1, 4, 7};
        int[] rightHandNums = new int[] {3, 6, 9};
        
        int leftHandNum = 0;
        int rightHandNum = 0;
        
        for (int num : numbers) {
            
            // 왼손 전용 숫자인지 확인
            if (isContains(leftHandNums, num)) {
                leftHandNum = num;
                answer.append(left);
                
            // 오른손 전용 숫자인지 확인
            } else if(isContains(rightHandNums, num)) {
                rightHandNum = num;
                answer.append(right);
            
            // 중간에 위치한 키
            } else {
                int leftLength = calculateLength(leftHandNum, num);
                int rightLength = calculateLength(rightHandNum, num);
                
                if (leftLength < rightLength) {
                    leftHandNum = num;
                    answer.append(left);
                    
                } else if(leftLength > rightLength) {
                    rightHandNum = num;
                    answer.append(right);
                    
                // 길이가 같을 때
                } else {
                    if ("left".equals(hand)) {
                        leftHandNum = num;
                        answer.append(left);
                        
                    } else {
                        rightHandNum = num;
                        answer.append(right);
                        
                    }
                }
            }
        }
        
        return answer.toString();
    }
    
    private boolean isContains(int[] numbers, int num) {
        for (int n : numbers) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
    
    // 거리 구하기.
    private int calculateLength(int curNum, int destNum) {
        // 제자리 누르기
        if (curNum == destNum) {
            return 0;
        }
        
        // 0은 11로 바꿔서 계산
        if (curNum == 0) {
            curNum = 11;
        }
        if (destNum == 0) {
            destNum = 11;
        }
        
        int abs = Math.abs(curNum - destNum);
        if (abs == 1 || abs == 3) {
            return 1;
        }
        
        if (abs == 2 || abs == 4 || abs == 6) {
            return 2;
        }
        
        if (abs == 5 || abs == 7 || abs == 9) {
            return 3;
        }
        
        // 1 차이 = 1
        // 위아래 3차이 = 1
        // 대각선 2 또는 4 차이 = 2
        // 6차이 = 2
        // 5, 7차이 = 3
        // 9 차이 = 3
        // 8, 10 차이 = 4
        
        
        // abs == 8 || abs == 10
        return 4;
    }
}
```
