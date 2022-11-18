# String & StringBuilder & StringBuffer

<br/>

## 1. String   
<br/>

- String은 immutable 하다.
  
  - 자바에서 문자열을 다룰 때 사용하는 String은
   <span style='background-color: #dcffe4'> __불변__ </span> 이다.  

  - 문자열에 + 연산자 등을 이용하여 다른 문자열을 추가할 때 새로운 문자열이 추가되는 것이   
  아니라 
  <span style='background-color: #dcffe4'> __새로운 문자열 객체를 만들고 그 객체를 참조__</span> 하게 된다.  

  - 래퍼런스가 가리키고 있던 문자열이 다른 문자열로 대체되고, 기존 문자열은
  <span style='background-color: #dcffe4'> __Unreachable__</span> 상태가 되어 가비지 컬렉션의 대상이 된다.

  - 이러한 이유로 String을 조작하는 연산은 시간과 자원(메모리)를 사용한다.


<br/>
<br/>

## 2. StringBuilder와 StringBuffer
- 가변의 속성을 가지고 있다는 점이 불변인 String과 비교되는 큰 차이

- 위의 둘은 문자열을 한 번 만들고 연산이 필요할 때마다 크기를 변경해 가며 문자열을 변경한다.
- 때문에 변경될 때마다 새롭게 객체를 만드는 String 보다 빠르다.
- StringBuilder와 StringBuffer의 차이는 무엇일까?
  - 둘의 차이는 <span style='background-color: #dcffe4'> __동기화__ </span>
  - StringBuilder는 동기화를 보장하지 않지만 StringBuffer는 동기화를 보장
    ```java
        //StringBuilder
        public StringBuilder append(Object obj) {
            return append(String.valueOf(obj));
        }

        //StringBuffer
        public synchronized StringBuffer append(String str) {
            toStringCache = null;
            super.append(str);
            return this;
        }
    ```

<br/>
<br/>

## 3. 정리
- 결과적으로 StringBuilder를 사용하는 것을 권장
- 반복문을 이용하게 되는 경우 String을 이용하면 성능적으로 좋지 않은 영향을 줄 수 있기에 StringBuilder를 사용하자.

