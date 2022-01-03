# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## 🔹 기능 요구사항
1. n대의 자동차가 존재한다.
2. 자동차의 이름을 한번에 입력받는다.
3. 자동차는 여러 대일 때 쉼표를 기준으로 구분한다.
4. 만약 자동차의 이름이 5글자를 넘어가면 IllegalArgumentException이 발생한다
5. 이동할 횟수를 입력받는다
6. 입력받은 횟수동안 자동차의 전진이 이루어진다.
7. 전진은 random 값에 따라서 전진한다.
8. random 기준 값은 4이상이면 전진, 3이하이면 멈춤을 기준으로 한다.
9. 전진은 '-'로 표시된다.
10. 각 회차마다 자동차 결과들을 출력한다
11. 게임이 종료되면 우승자를 발표한다
