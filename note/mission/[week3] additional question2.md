# [week3] additional question2

<br/>

## 문제 1. Stack 만들기

- 배열을 기반으로 String 문자열을 받는 Stack을 구현하는 것이 목적 

- 주어진 Stack 인터페이스에 명시된 메소드를 구현하는 StringStack 클래스 작성

- __StringStack 구현__
  - String 배열을 선언하고 생성자를 통하여 스택의 크기를 전달 받아 초기화 한다.
  
  - 스택의 top 위치를 저장하는 Integer형 변수 top을 선언(-1로 초기화)
  
  - _public int length()_
    - 스택에 현재 저장된 값의 개수를 반환 top이 가리키고 있는 값에 +1
    
  - public int capacity()
    - 스택이 수용할 수 있는 총 길이를 반환. 생성한 stringStack 배열의 길이를 반환
    
  - public String pop()
    - top이 -1이면 스택이 빈 것이므로 비었다는 값을 반환
    - 비어 있지 않다면 top이 가리키는 위치의 값을 리턴 해주고 배열에서 값을 지운 후 top의 위치를 1 감소
    
  - public boolean push(String val) 
    - 스택이 가득 차 있다면 false를 반환
    - 그렇지 않다면 top을 1 증가 시킨 후 해당 위치에 값을 저장

- 🔗[Stack 만들기 소스 코드 링크](https://github.com/Hambak-note/masters-pre/tree/main/mission/src/week3/day5/question1)