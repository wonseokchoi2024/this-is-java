package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        //자바11이전 문법
        int score1 = 0;

        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score = " + score1);

        //자바13이후 문법
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;       // score2 = result라는 뜻 return의 의미
            }
            default -> 60;
        };
        System.out.println("score2 = " + score2);



    }
}
