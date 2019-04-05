# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/wwh-techcamp-2018/wwh-docs/blob/master/README.md)
* [동영상으로 살펴보는 온라인 코드 리뷰 과정](https://youtu.be/a5c9ku-_fok)



## racingGame-step1 

> 학습 내용

**JUnit** 에서 실패 처리하는 방법

`fail()`, `fail(String message)`



**여러가지 메소드**

- `assertEquals` : 값
- `assertNull`, `NotNull` : null
- `assertTrue`, `assertFalse` : 조건
- `assertSame`, `NotSame` : 객체 



> 궁금증

**private 메소드나 변수를 어떻게 테스트할까?**

private로 선언된 메소드나 변수는 외부에서 접근이 불가능하다. 따라서 테스트클래스에서 접근하기 어렵다. 그렇다고 private를 테스트하기 위해서 public으로 바꾸면 안됨.

테스트가 꼭 필요하다고 생각될 시 하는 법

- Private 변수

  객체  `Field field` 생성 후, `field = privateClass.getClass().getDeclaredField("필드명")`

  `field.setAccessible(true);`(접근 허용)



- private 메소드

  메소드 객체 `Method method;` 생성 후 해당 객체에 사용하고자 하는 private 메소드를 담아줌 `method = privateclass.getClass().getDeclaredMethod("메소드 이름", 파라미터, 파라미터);`

  `method.setAccessible(true);` (접근 허용) - private 메소드를 접근 할 수 있게됨

  마지막으로 invoke 메소드를 사용해 호출

  `method.invoke(private 메소드를 가진 클래스명, 파라미터, 파라미터, …);`

 [참고 사이트][cocodo.tistory.com/16]



