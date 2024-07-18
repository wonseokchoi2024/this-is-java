package ch05.test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        //배열 만들기
        String[][] strArr1 = new String[5][5];
        strArr1[0][0] = "Hello";
        System.out.println(strArr1[0][0]);

        //배열 선언 때 null값이 되는지 확인
        int[] a = null;
        a = new int[5];
        a[0] = 1;
        System.out.println(a[0]);

        //Scanner
        /*Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력하세요>");
        System.out.println("한번더");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1);
        System.out.println(s2);*/

        //String을 바꿀 수 있는지
        String g = "1";
        g = "B";
        System.out.println(g);
    }
}
