https://programmers.co.kr/learn/courses/30/lessons/17681?language=java#

```java
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr1[i] | arr2[i];
        }
        
        for (int i = 0; i < n; i++) {
            String s = convertToBinary(n, result[i]);
            s = s.replace('1', '#');
            s = s.replace('0', ' ');
            answer[i] = s;
        }
        
        return answer;
    }
    
    private String convertToBinary(int n, int num) {

        StringBuilder sb = new StringBuilder(n);

        // 2진수로 변환
        while (num > 0) {
            sb.append(num % 2);
            num /= 2;
        }
        
        // n자리수를 채우기 위해, 0 붙이기
        int size = sb.length();
        if (size != n) {
            for (int i = 0; i < n - size; i++) {
                sb.append(0);
            }
        }
        
        return sb.reverse().toString();
    }
}
```
다른 사람 풀이
```java
class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
```
Integer에 toBinaryString() 함수가 존재한다.   
String 함수에서 정규식을 사용하는 replaceAll() 보다는 replace()가 더 빠르다.
