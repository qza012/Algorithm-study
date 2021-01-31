# Scanner

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
long l = sc.nextLong();
String s = sc.next();
String ss = sc.nextLine().split(" ");
```
Scanner는 속도가 느려서 시간초과 날 확률이 높다.    
<br/>

# BufferedReader

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 한줄을 읽고 split을 이용해 " "를 기준으로 나눠서 저장.
String[] s = br.readLine().split(" ");

br.read(); // char 1개를 읽어옴.

```
입력을 buffer에 저장해두고 한꺼번에 전송해서 scanner보다 빠르다.        
<br/>

# StringTokenizer
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());

st.nextToken();
```