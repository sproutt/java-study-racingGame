# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/wwh-techcamp-2018/wwh-docs/blob/master/README.md)

* [동영상으로 살펴보는 온라인 코드 리뷰 과정](https://youtu.be/a5c9ku-_fok)



## 문자열 계산기 구현 중 학습(?) 

> if - else 문을 사용 하지 않는 이유

- else문 사용시 복잡성 증가 -> else if 문 까지 비교를 해야 if 문이 끝남.
- 한번에 이해하기 힘듬 -> if 문이 쉽다는 느낌이 강함
- 의사소통이 쉬움



> TDD란

테스트를 먼저 만들고 테스트를 통과하기 위한 것을 짜는 것.



> TDD가 필요한 상황

- 나에 대한 불확실성이 높은 경우
- 외부적 불확실성이 높은 경우
- 개발하는 중에 코들 많이 바꿔야 하는 경우
- 다른사람이 유지 보수를 할 경우



> 효과

- 피드백 증가
- 남들에게 테스트 코드를 보여주고 그 코드를 직접 실행
- 협력
  - 남이 짠 코드 쉽고 빠르게 이해
- 불확실성에 대비
- 버그를 줄일 수 있음.
- 코드 복잡도가 떨어짐 -> 클린 코드 -> 유지보수 비용 감소



> 단점

- 개발 시간이 늘어남
- 개발 방식을 바꿔야함



> Unit 사용법

```java
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.sum(10, 20));
    }
```

Test 클래스에서 `@Test` 와 메소드를 생성 -> `assertEqulas();` 메소드를 이용하여 구현할 코드를 테스트



```java
@Before
public void setUp() {
    calculator = new StringCalculator();
}
```

test 코드를 사용하기 전에 미리 구현할 수 있는 메소드 `@before`, `public void setUp()` 사용
