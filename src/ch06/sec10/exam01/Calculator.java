package ch06.sec10.exam01;

//static 정적 멤버
//정적 필드는 일반적으로 선언과 동시에 초기값을 대입함

public class Calculator {
    static double pi = 3.14;

    static double plus(double a, double b) {
        return a + b;
    }

    static double minus(double x, double y) {
        return x - y;
    }
}

