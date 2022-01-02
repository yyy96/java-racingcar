package view;

import domain.Car;

import java.util.List;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    static final String IS = " : ";
    static final String COMMA = ", ";
    static final String ONE_MOVING = "-";

    public String enterCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.next();
    }

    public int enterGameTurn() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }

    public void printTurnResult(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).getName() + IS);
            printCarMoving(cars.get(i).getDistance());
        }
        System.out.println();
    }

    public void printCarMoving(int distance) {
        for (int i = 0; i < distance; i++) {
            System.out.print(ONE_MOVING);
        }
        System.out.println();
    }

    public void printWinnerResult(List<String> winner) {
        System.out.print(winner.get(0));
        for (int i = 1; i < winner.size(); i++) {
            System.out.print(COMMA + winner.get(i));
        }
        System.out.println("가 최종 우승했습니다");
    }
}
