package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double result1 = calc.areaRectangle(3.5);
        System.out.println("정사각형의 넓이 = " + result1);

        double result2 = calc.areaRectangle(2.2, 3.3);
        System.out.println("직사각형의 넓이 = " + result2);
    }
}
