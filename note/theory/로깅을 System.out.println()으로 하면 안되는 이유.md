# 로깅을 System.out.println()으로 하면 안되는 이유

<br/>
<br/>

## 1. 휘발된다.

- System.out.println()은 로그가 표준 출력으로 출력
  
- __파일로 저장되지 않고 휘발__ 된다는 의미
  
- 로그는 에러 발생 상황을 기록하여 추후에 문제를 파악하여 고치기 위해 사용한다.
  
- 표준 출력으로 한 번 출력되고 저장되지 않는다면 로그의 역할을 할 수 없다. 
  
<br/>
<br/>

## 2. 에러 발생 시에 추적할 수 있는 최소한의 정보가 남지 않는다.

-  System.out.println()은 인자로 전달한 문자열 만을 출력
  
-  문제가 발생한 날짜 시각 그리고 문제의 수준 등 최소한의 정보가 기록되지 않음

-  이러한 정보를 인자로 전달할 수는 있으나 매번 그런 정보를 일일히 전달하기에는 번거로움이 존재

<br/>
<br/>

## 3. 로그 출력 레벨을 사용할 수 없다.

- 로컬에서는 개발할 때 디버깅을 위한 아주 상세한 정보가 출력 되어야 한다.
  
- 반면, 프로덕션에서 동작하는 코드는 에러/장애가 발생할 때 문제를 진단할 수 있는 정보만을 남겨야 한다.

- 로깅 라이브러리는 환경에 맞게 로그가 출력될 수 있또록 로그 출력 레벨이라는 기능을 제공

- Logback 라이브러리에서는 TRACE, DEBUG, INFO, WARN, ERROR, FATAL과 같은 레벨을 제공

- System.out.println()은 이러한 기능을 제공하지 않는다.

<br/>
<br/>

## 4. 성능 저하의 원인이 될 수 있다.

- System.out.println()의 구현 코드
  
    ```java
        public void println() {
            ewLine();
        }

        private void newLine() {
        try {
            synchronized (this) {
                ensureOpen();
                textOut.newLine();
                textOut.flushBuffer();
                charOut.flushBuffer();
                if (autoFlush)
                    out.flush();
            }
        }
        ...
    ```

    - println()은 newLine()을 호출.
  
    -  newLine()에는 synchronized 키워드가 존재

    - 때문에 newLine() 메소드는 임계영역이 된다.

    - 멀티 쓰레드 환경에서 A 쓰레드가 newLine() 메소드를 실행하면 메소드는 잠기게 됨

    - 다른 쓰레드는 A 쓰레드가 모두 사용하고 잠금을 풀어준 뒤에서야 newLine() 메소드를 실행할 수 있으므로, __오버헤드__ 가 발생한다.

<br/>
<br/>

## 🔗 참고 링크
- https://hudi.blog/do-not-use-system-out-println-for-logging/
