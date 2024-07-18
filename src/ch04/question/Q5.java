package ch04.question;

public class Q5 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
//                int sum = (4 * x) + (5 * y);
                if ( (4*x + 5*y) == 10) {
                    System.out.println("x의 값 = " + x + " / y의 값 = " + y +  "합은 60입니다");
                }
            }
        }
    }
}
