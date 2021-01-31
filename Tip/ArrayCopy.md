# 복사 메서드들
```java

int[] a = {1,2,3,4,5}

// Cloneable 인터페이스가 구현된 class에서만 사용 가능.
int[] b = a.clone();

// 배열의 시작점부터 length만큼 복사
b = Arrays.copyOf(a, a.length);

// 배열의 특정 범위를 복사
b = Arrays.copyOfRange(a, 1, 3);



```
