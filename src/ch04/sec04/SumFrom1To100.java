package ch04.sec04;

public class SumFrom1To100 {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for (i = 1; i <= 100; i++) {
            sum += i;

            System.out.println((sum-i) + " + " + i + " = " + sum);
        }
    }
}
