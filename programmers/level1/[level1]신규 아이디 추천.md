https://programmers.co.kr/learn/courses/30/lessons/72410

```java
class Solution {
    
    private String word;
    
    public String solution(String new_id) {
        
        word = new_id;
        
        first();
        second();
        third();
        fourth();       
        fifth();
        sixth(); 
        seventh();
        
        return word;
    }
    
    private void first() {
        word = word.toLowerCase();
    }
    
    private void second() {
        // [] : 문자열에서 찾기
        // ^  : 제외
        // \w : 알파벳, 숫자, _인 문자
        // \. : .인 문자
        // \- : -인 문자
        word = word.replaceAll("[^\\w\\.\\-]", "");
    }
    
    private void third() {
        // x{n} : x 문자가 n번 반복
        while (word.contains("..")) {
            word = word.replaceAll("\\.{2}", ".");
        }
    }

    private void fourth() {
        // ^x : 문자열의 시작이 x
        // x$ : 문자열의 끝이 x
        // | : 또는
        word = word.replaceAll("^\\.|\\.$", "");
    }
    
    private void fifth() {
        if (word.length() == 0) {
            word = "a";
        }
    }
    
    private void sixth() {
        if (word.length() >= 16) {
            word = word.substring(0, 15).replaceAll("\\.$", "");
        }
    }
    
    private void seventh() {
        int length = word.length();

        if (length <= 2) {
            char lastChar = word.charAt(word.length() - 1);
            
            while (word.length() < 3) {
                word += lastChar;
            }
        }
    }
}
```
