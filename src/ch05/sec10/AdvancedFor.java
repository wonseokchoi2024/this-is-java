package ch05.sec10;

public class AdvancedFor {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("점수 총합 = " + sum);

        String[] str = {"가", "나", "다", "라", "마"};
        for (String s : str) {
            System.out.println(s);
        }
    }
}
