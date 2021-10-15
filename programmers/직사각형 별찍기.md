https://programmers.co.kr/learn/courses/30/lessons/12969

```java
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                result.append("*");
            }
            result.append("\n");
        }
        
        System.out.println(result.toString());
    }
}
```

시간 복잡도 : O(n^2)

가로의 길이가 a, 세로의 길이가 b 이므로  
for문을 돌려서 가로의 길이만큼 '*'을 넣어준 후 개행문자를 삽입한다. 

- String vs StringBuffer vs StringBuilder
String은 '+' 연산 시, String 객체를 새로 생성해서 반환하기 때문에 효율이 좋지 않다. (기존 객체는 GC의 대상이 된다.)   
StringBuilder와 StringBuffer는 내부적으로 가변배열을 사용하기 때문에 새로운 객체가 생성되지 않는다.   
  
StringBuilder : 동기화 X 
StringBuffer : 동기화 O

출처 : https://ifuwanna.tistory.com/221
