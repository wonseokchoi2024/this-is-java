package ch04.sec03;

import java.util.Scanner;

public class SwitchCharExample {
    public static void main(String[] args) {

//        char grade = 'B';
//        String gradeString = "A";
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 알파벳을 입력하세요 : ");
        String string = sc.nextLine();

        //대소문자 구별 X
        switch (string) {
            case "A":
            case "a":
                System.out.println("우수 회원입니다");
                break;
            case "B":
            case "b":
                System.out.println("일반 회원입니다");
                break;
            default:
                System.out.println("손님입니다");
        }

        sc.close();
    }
}
