https://programmers.co.kr/learn/courses/30/lessons/17682?language=java#

```java
import java.util.*;

class Solution {
    public int solution(String dartResult) {
        char[] cArr = dartResult.toCharArray();        
        int[] scores = new int[3];
        int[] bonuses = new int[3];
        int[] options = new int[] {1, 1, 1};
        int[] totalScores = new int[3];
        
        int index = 0;
        for (int i = 0; i < 3; ++i) {
            
            // 1. 점수
            // 두 자릿수를 전달
            scores[i] = getScore(Arrays.copyOfRange(cArr, index, index + 2));
            
            // 두 자릿수 점수면 index를 2 증가
            if (scores[i] == 10) {
                index += 2;
            } else {
                ++index;
            }
            
            // 2. 보너스
            // 보너스는 한 자릿수
            bonuses[i] = getBonus(cArr[index]);
            ++index;
            
            // 세 번째 점수가 옵션 없이 끝날 수 있음
            if (index >= cArr.length) {
                break;
            }
            
            // 3. 옵션
            if (cArr[index] == '*') {
                // 처음에 나오면 처음것만 *2
                if (i == 0) {
                    options[i] *= 2;
                } else {
                    options[i - 1] *= 2;
                    options[i] *= 2;
                }
            } else if (cArr[index] == '#') {
                options[i] *= -1;
            }
            
            // 옵션이 존재했으면 인덱스 증가
            if (cArr[index] == '*' || cArr[index] == '#') {
                ++index;
            }
        }
        
        // 각 점수 및 통합 계산
        int answer = 0;
        for (int i = 0; i < 3; ++i) {
            // System.out.println(scores[i] + ", " + bonuses[i] + ", " + options[i]);
            totalScores[i] = (int)Math.pow(scores[i], bonuses[i]) * options[i];
            answer += totalScores[i];
        }
        
        return answer;
    }
    
    private int getScore(char[] cArr) {
        // 점수가 0점일 때
        if (cArr[0] == '0') {
            return 0;
        }
        
        // 점수가 1 또는 10점일 때
        if (cArr[0] == '1') {
            if (cArr[1] == '0') {
                return 10;
            }
            return 1;
        }
        
        // 점수가 2 ~ 9점일 때
        return cArr[0] - '0';
    }
    
    private int getBonus(char c) {
        char[] bonusChars = new char[] {'S', 'D', 'T'};
        int bonus = 0;
        
        int size = bonusChars.length;
        for (int i = 0; i < size; ++i) {
            if (c == bonusChars[i]) {
                bonus = i + 1;
                break;
            }
        }
        
        return bonus;
    }
}
```
