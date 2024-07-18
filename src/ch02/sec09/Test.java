package ch02.sec09;

public class Test {
    public static void main(String[] args) {
        byte result = 10 + 20;
        System.out.println(result);

        byte x = 10;
        byte y = 20;
        // byte result1 = x + y;   불가능한 이유가 변수를 피연산자로 연산하면 x와 y가 int로 변환돼서 계산
        int result2 = x + y;

        int a = 10;
        int b = 20;
        int result3 = a + b;

        int intValue = 10;
        double doubleValue = 5.5;
        int result4 = intValue + (int) doubleValue; //15로 저장
        System.out.println(result4);

        int c = 1;
        int d = 2;
        double result5 = c / d;
        System.out.println(result5); // 자바에서 정수연산 결과는 정수로 저장
    }
}
