package ch04.question;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int account = 0;
        boolean roof = true;
        Scanner sc = new Scanner(System.in);
        while (roof) {
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("선택>");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("예금액>");
                    account += sc.nextInt();
                }
                case 2 -> {
                    System.out.println("출금액>");
                    account -= sc.nextInt();
                }
                case 3 -> {
                    System.out.println("현재 잔고 = " + account);
                }
                case 4 -> {
                    System.out.println("시스템을 종료합니다");
                    roof = false;
                }
                default -> {
                    System.out.println("1~4번 사이를 입력해주세요");
                }
            }

            //if문
            /*if (choice.equals("1")) {
                System.out.println("예금액>");
                account += sc.nextInt();
                System.out.println("현재 예금액 = " + account);
            }

            if (choice.equals("2")) {
                System.out.println("출금액>");
                account -= sc.nextInt();
                System.out.println("현재 예금액 = " + account);
            }

            if (choice.equals("3")) {
                System.out.println("잔고 = " + account);
            }

            if (choice.equals("4")) {
                break;
            }*/
        }

    }
}
