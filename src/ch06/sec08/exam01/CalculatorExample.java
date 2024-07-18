package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        //Calculator 객체 생성
        Calculator myCalc = new Calculator();

        //리턴값이 없는 powerOn() 메소드 호출
        myCalc.powerOn();

        //plus메소드 호출 시 5와 6을 매개값으로 제공하고, result1에 결과 대입
        int result1 = myCalc.plus(5, 6);
        System.out.println(result1);

        //divide메소드 호출 시 미리 선언한 변수로 매개값을 제공하고 result2에 대입
        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println(result2);

        //리턴값이 없는 powerOff호출
        myCalc.powerOff();
    }
}
