# [week3] additional question2

<br/>

## :one: Stack 만들기

- 배열을 기반으로 String 문자열을 받는 Stack을 구현하는 것이 목적 

- 주어진 Stack 인터페이스에 명시된 메소드를 구현하는 StringStack 클래스 작성

- __StringStack 구현__
  - String 배열을 선언하고 생성자를 통하여 스택의 크기를 전달 받아 초기화 한다.
  
  - 스택의 top 위치를 저장하는 Integer형 변수 top을 선언(-1로 초기화)
  
  - _public int length()_
    - 스택에 현재 저장된 값의 개수를 반환 top이 가리키고 있는 값에 +1
    
  - _public int capacity()_
    - 스택이 수용할 수 있는 총 길이를 반환. 생성한 stringStack 배열의 길이를 반환
    
  - _public String pop()_
    - top이 -1이면 스택이 빈 것이므로 비었다는 값을 반환
    - 비어 있지 않다면 top이 가리키는 위치의 값을 리턴 해주고 배열에서 값을 지운 후 top의 위치를 1 감소
    
  - public boolean push(String val) 
    - 스택이 가득 차 있다면 false를 반환
    - 그렇지 않다면 top을 1 증가 시킨 후 해당 위치에 값을 저장

- 🔗[Stack 만들기 소스 코드 링크](https://github.com/Hambak-note/masters-pre/tree/main/mission/src/week3/day5/question1)

<br/><br/>

## :two: Key : Value 저장소

- 키와 값을 하나의 아이템으로 저장하고 검색 수정이 가능한 추상 클래스를 상속받아 사전 클래스 구현
- Dictionary 구현
  - _public Dictionary(Integer capacity)_
    - 사전 클래스의 생성자
    - 사전의 크기를 매개변수로 받아 key 배열과 value 배열을 초기화 한다.
    - 현재 위치를 저장하기 위한 curPoint 변수를 -1로 초기화한다.

  - _String get(String key)_
    - key 값을 매개변수로 받아 key에 해당하는 value 배열의 값을 반환
    - key 배열을 Array로 변환하여 indexOf() 메서드를 사용하여 index를 찾는다.
    - value 배열에서 구한 index 위치에 있는 값을 return 한다.
    
  - _void put(String key, String value)_
    - key와 value를 매개변수로 받아 값을 입력한다.
    - 해당 key 값이 존재하지 않는 경우
      - 사전이 가득 차 있는지 확인하고 가득 차 있지 않다면 입력(curPoint에)
    - key 값이 존재하는 경우 전달받은 value 값으로 덮어 씌운다.
    
  - _String delete(String key)_
    - 전달받은 key 값의 value를 삭제한다.
    - 해당 key도 같이 삭제하도록 구현하였고, curPoint를 활용하여 삭제한 위치 뒤의 값들을 땡겨줬따.

- 🔗[Key : Value 저장소 소스 코드 링크](https://github.com/Hambak-note/masters-pre/tree/main/mission/src/week3/day5/question2)

<br/><br/>

## :three::four: Shape 완성하기

- 도형의 구성을 묘사하는 인터페이스가 주어진다.

- 이 인터페이스를 구현하여 원, 타원, 사각형에 관련된 클래스를 작성한다.

- 각 클래스를 구현하여 해당 도형의 넓이를 계산하는 방식의 차이만 있고 간단한 구현이었다.

🔗[Shape 완성하기 소스 코드 링크](https://github.com/Hambak-note/masters-pre/tree/main/mission/src/week3/day5/question3and4)