package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 91;
        int score1 = 81;
        int score2 = 1;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");


    }
}
