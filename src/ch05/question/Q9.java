package ch05.question;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        boolean option = true;
        int count = 0;
        int sum = 0;
        int highest = 0;
        double avg = 0.0;
        int[] arr = null;
        Scanner sc = new Scanner(System.in);

        while (option) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택>");
            int choice = 0;

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("학생수>");
                    count = Integer.parseInt(sc.nextLine());
                    arr = new int[count];
                }
                case 2 -> {
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("scores[" + i + "]>");
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                }
                case 3 -> {
                    for (int i : arr) {
                        System.out.println(i);
                    }
                }
                case 4 -> {
                    for (int i : arr) {
                        highest = i;
                        sum += i;
                    }
                    System.out.println("최고 점수 = " + highest);
                    avg = (double) sum / count;
                    System.out.println("평균 점수 = " + avg);
                }
                case 5 -> {
                    System.out.println("프로그램을 종료합니다");
                    option = false;
                }
                default -> System.out.println("1~5번 사이를 입력하세요");
            }
        }
    }
}
