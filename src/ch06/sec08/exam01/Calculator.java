package ch06.sec08.exam01;

//메소드 선언과 호출
public class Calculator {
    //리턴값이 없는 메소드 선언
    void powerOn() {
        System.out.println("전원을 켭니다");
    }

    void powerOff() {
        System.out.println("전원을 종료합니다");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }
}
