# 문자 변경
```java
Sting str1 = "qwer";

// str1안의 문자열 중에서 'src'를 찾고 'dst'로 변경.
// src는 string값을 사용한다.
String str2 = str1.replace(src, dst)

// src는 정규표현식을 사용한다.
str2 = str1.replaceAll(src, dst)


```