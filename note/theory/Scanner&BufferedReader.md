# Scanner & Buffered Reader

- Scanner와 BufferedReader 모두 사용자(키보드) 입력을 받을 수 있는 기능을 제공한다.
- 두 클래스가 가지고 있는 함수들에도 차이가 있지만 가장 큰 차이는 ==속도==이다.

- Scanner와 BufferedReader 사용법
    ```java
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        BufferedReader br = new BufferedReader(new InutStreamReader(System.in));
        String input = br.readLine();
    }
    ```
#
#

### 속도 차이의 이유
- buffer 사용 여부의 차이
- Scanner는 1KB 크기의 버퍼를 갖기 때문에 입력이 바로 전달된다.
- BufferedReader는 8KB 크기의 버퍼를 갖기 때문에 buffer에 입력을 저장하였다 한 번에 전송하기 때문에 더 빠른 속도를 가진다.
- 또한, Scanner는 입력을 읽는 과정에서 내부에서 정규 표현식 적용, 입력값 분할, 파싱 과정 등을 거치기 때문에 속도가 느리다.


#
#
### 동작 방식
- 두 클래스는 공통적으로 생성할 때 ==System.in==을 매개변수로 받는다.
- System.in은 java.lang 패키지의 System 클래스이며, System 클래스의 in은 정적(static) 변수이다.
    ```java
    public final class System {
        public static final InputStream in = null
        ...
    }
    ```
    - in은 inputStream 타입의 변수
    - InputStream은 java.io 패키지의 바이트 단위 입력을 위한 최상위 입력 스트림 클래스
    - System.in을 매개변수로 사용하기 때문에 사용자(키보드) 입력을 받을 수 있다.
    #
- System.in과 BufferedReader 클래스를 사용할 때는 main 옆에 throws IOException이 붙는다.
- 사용자의 입력은 여러 다양한 타입으로 들어올 수 있고, 잘못된 값이 들어올 경우 에러가 나지 않도록 예외처리가 필요
#
- Scanner는 System.in을 생성할 때 내부에서 try-catch를 사용하여 예외처리를 하기 때문에 따로 예외 처리하지 않아도 됨
- Scanner와 달리 BufferedReader는 생성시에 매개변수로 InputStreamReader를 사용
- Scanner 또한 클래스 생성자에서 InputStreamReader를 생성하여 사용한다.
    ```java
    ...
        public Scanner(InputStream source) {
            this(new InputStreamReader(source), WHITESPACE_PATTERN);
        }
    ...
    ```
    - InputStreamReader란 문자 입력 스트림의 한 종류로 입력 장치(키보드 등)으로 부터 받은 입력 값을 자바 응용 프로그램으로 전달하는 객체이다.
    - 자바 응용 프로그램은 입력 장치로부터 직접 데이터를 읽지 않고 입력 스트림을 통해 데이터를 읽는다.
    
    
    
    
    
    
    
    
