package ch04.sec02;

public class IfElseElseExample {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) {
            System.out.println("점수가 90점 이상입니다");
            System.out.println("A등급입니다");
        } else if (score >= 80) {
            System.out.println("점수가 80~89점입니다");
            System.out.println("B등급입니다");
        } else if (score >= 70) {
            System.out.println("점수가 70~79점 입니다");
            System.out.println("C등급입니다");
        } else {
            System.out.println("점수가 70점 미만입니다");
            System.out.println("D등급입니다");
        }

    }
}
