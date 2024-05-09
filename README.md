# Ch06. MVC 프레임워크 만들기
## 01. 리플렉션 API 개념 소개 및 실습

## 실습 목표
- @Controller 애노테이션이 설정되어 있는 모든 클래스를 찾아서 출력한다.
- (실습 코드) https://github.com/serverwizard/jdbc-practice/tree/master/mvc-practice

## 개념 정리
### Reflection
- 힙 영역에 로드되어 있는 클래스 타입의 객체를 통해 필드/메서드/생성자를 접근제어자와 무관하게 사용가능하도록 지원하는 API
  - 힙 영역에 로드된 클래스 타입 객체 가져오는 방법 3가지
    - class.class, instance.getclass, class.fullname
  - JVM 의 클래스 로더는 클래스 파일에 대한 로딩이 끝나면 클래스 타입의 객체를 생성해서 메모리 '힙 영역'에 저장함
- 컴파일 시점이 아닌 런타임 시점에 '동적'으로 특정 클래스의 정보를 추출해낼 수 있는 프로그래밍 기법
- 주로 프레임워크 또는 라이브러리 개발 시 사용됨
- 리플렉션 라이브러리 사용법
  - https://www.baeldung.com/reflections-library

### Reflection 을 사용하는 프레임워크/라이브러리 소개
- Spring 프레임워크 (ex. DI)
- Test 프레임워크 (ex. JUnit)
- JSON Serialization/Deserialization 라이브러리 (ex. Jackson)


