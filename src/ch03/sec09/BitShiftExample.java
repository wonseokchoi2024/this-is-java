package ch03.sec09;

public class BitShiftExample {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2, 3);  // Math.pow(a, b)는 a^b를 연산하고 double값으로 출력, 여기서는 int로 캐스팅함
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        int num2 = -8;
        int result3 = num2 >> 3;
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

    }
}
