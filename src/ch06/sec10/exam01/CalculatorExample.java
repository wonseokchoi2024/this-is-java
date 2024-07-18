package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        double result1 = Calculator.pi;
        System.out.println("result1 = " + result1);

        double result2 = Calculator.plus(1.2, 2.3);
        System.out.println("result2 = " + result2);

        double result3 = Calculator.minus(3.5, 2.5);
        System.out.println("result3 = " + result3);
    }
}
