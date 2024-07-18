package ch04.question;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 등급을 입력해해주세요");
        System.out.println("예시: A, B, C, ...");
        System.out.println(">");
        grade = sc.nextLine();

        //예전 방법
//        int score1 = 0;
//        switch (grade) {
//            case "A":
//                score1 = 100;
//                break;
//            case "B":
//                int result = 100 - 20;
//                score1 = result;
//                break;
//            default:
//                score1 = 60;
//
//        }

        //최신 방법
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result2 = 100 - 20;
                yield result2;
            }
            default -> 60;

        };


        System.out.println(score2);
        sc.close();




    }
}
