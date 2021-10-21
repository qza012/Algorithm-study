https://programmers.co.kr/learn/courses/30/lessons/12933?language=java

```java
class Solution {
    public long solution(long n) {
        
        String num = String.valueOf(n);
        char[] nums = num.toCharArray();
        
        Arrays.sort(nums);
        
        StringBuilder answer = new StringBuilder();
        for(char c : nums) {
            answer.append(c);
        }
        
        return Long.parseLong(answer.reverse().toString());
    }
}

```
1. 문자열을 한 문자씩 자른다.
2. 내림차순으로 정렬한다.
3. 정렬된 문자 배열들을 다시 붙인다.

정렬할 때 내림차순으로 정렬하고 싶었지만, Arrays.sort(객체 배열, Comparator)는 기본자료형에 대해서 Comparator 기능을 제공하지 않는다.
