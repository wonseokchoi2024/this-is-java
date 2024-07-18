package ch04.sec05;

public class SumFrom1To100 {
    public static void main(String[] args) {
        int i = 1, sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
            System.out.println(sum);
        }
    }
}
