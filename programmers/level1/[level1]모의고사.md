https://programmers.co.kr/learn/courses/30/lessons/42840?language=java  

```java
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[][] student = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] answerCount = new int[student.length];
        
        int max = 0;
        for (int i = 0; i < student.length; i++) {
            
            // 각 학생별로 정답 개수 계산
            for (int j = 0; j < answers.length; j++) {
                if (student[i][j % student[i].length] == answers[j]) {
                    answerCount[i]++;
                }
            }
            
            // 가장 큰 정답 개수 찾기
            if (max < answerCount[i]) {
                max = answerCount[i];
            }
        }

        // max와 동일한 수를 맞춘 학생 찾기
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < answerCount.length; i++) {
            if (max == answerCount[i]) {
                list.add(i + 1);
            }
        }
        
        // int 배열로 반환
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
        //return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
```
     
```java
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        Student[] students = new Student[] {
            new Student(1, new int[] {1, 2, 3, 4, 5}),
            new Student(2, new int[] {2, 1, 2, 3, 2, 4, 2, 5}),
            new Student(3, new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5})
        };
        
        // 각 학생별 맞춘 문제 수 계산
        int max = 0;
        for (Student s : students) {
            int count = s.calculateAnswerCount(answers);
            
            // 가장 큰 정답 개수 찾기
            if (max < count) {
                max = count;
            }
        }
        
        // max와 맞춘 문제 수가 같은 학생 찾기
        List<Integer> list = new ArrayList<>();
        for (Student s : students) {
            if (s.getAnswerCount() == max) {
                list.add(s.getNumber());
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        //return list.stream().mapToInt(Integer::valueOf).toArray();
    }
    
    class Student {
        
        private int number;
        private int[] answers;
        private int answerCount;
        
        public Student(int number, int[] studentAnswers) {
            this.number = number;
            this.answers = studentAnswers;
            this.answerCount = 0;
        }
        
        public int calculateAnswerCount(int[] realAnswers) {
            for (int i = 0; i < realAnswers.length; i++) {
                if (realAnswers[i] == this.answers[i % answers.length]) {
                    answerCount++;
                }
            }
            
            return answerCount;
        }
        
        public int getNumber() {
            return number;
        }
        
        public int getAnswerCount() {
            return this.answerCount;
        }
        
    }
}
```

