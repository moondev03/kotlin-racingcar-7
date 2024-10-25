# 프리코스 2주차 - 자동차 경주

<br>

## 📌 개요

초간단 자동차 경주 게임을 구현한다.

<br>

## 📝 기능 목록

### RacingCar

- [x] 각 자동차는 이름을 가지고 있다.
- [x] 전진 또는 멈출 수 있다.
    - [x] 전진하는 조건은 0에서 9사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
        - [x] Random 값 추출은 `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()`를 활용해야 한다.

### RacingGame

- [x] 입력으로부터 경주에 참여할 자동차들을 생성할 수 있어야한다.
- [x] 경주에 참여한 자동차들은 회차별로 한 번의 이동 기회만 있어야 한다.
- [x] 완료 후 누가 우승했는지 알 수 있어야 한다.
    - [x] 우승자는 다수일 수 있다.

### RacingGameController

- [x] 입력받은 이동 횟수만큼 각 자동차에게 이동 기회를 부여해야 한다.
- [x] 자동차 경주의 전체적인 흐름을 제어해야 한다.

### InputView

- [x] 각 자동차에 이름을 입력할 수 있어야 한다.
    - [x] `경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)` 문구를 출력 후 입력을 받는다.
        - [x] 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용
    - [x] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션을 종료시킨다.
        - [x] 입력이 빈 문자열 또는 공백 문자열인 경우
        - [x] `Length`가 5를 초과한 자동차 이름이 있는 경우
        - [x] 중복된 자동차 이름이 있는 경우
- [x] 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
    - [x] `시도할 횟수는 몇 회인가요?` 문구를 출력 후 입력을 받는다.
        - [x] 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용
    - [x] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션을 종료시킨다.
        - [x] 입력이 빈 문자열 또는 공백 문자열인 경우
        - [x] 입력이 숫자가 아닌 경우
        - [x] 입력이 0 이하인 경우

### OutputView

- [x] 차수별 실행 결과를 출력할 수 있어야 한다.
    - [x] `pobi : -` 형식으로 전진한 만큼 `-`를 표시해야 한다.
    - [x] 각 자동차는 줄넘김을 사용하여 사용자 입력 순서대로 출력되어야 한다.
    - [x] 각 차수별 실행 결과는 빈 줄을 통해 구분해야 한다.
- [x] `최종 우승자 : pobi, jun` 형식으로 최종 우승자를 출력할 수 있어야 한다.
    - [x] 최종 우승자가 다수일 경우 `, `로 구분해야 한다.

<br>

## 📝 프로그래밍 요구사항

_프로그래밍 요구사항은 구현 완료 후 위반되는 내용이 없는지 확인한다._

- [x] Indent Depth를 3이 넘지 않도록 구현한다.
    - 예를 들어, while문 안에 if문이 있으면 indent는 2이다.
- [x] 함수가 한 가지 일만 하도록 최대한 작게 만들어라.
- [x] JUnit5와 AssertJ를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 테스트 코드로 확인한다.