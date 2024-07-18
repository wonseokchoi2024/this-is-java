package ch04.sec04;

public class MultiplicationTable {
    public static void main(String[] args) {
//        int i, j;

        for (int i = 1; i < 10; i++) {
            System.out.println("ㅡㅡㅡ" + i + "단ㅡㅡㅡ");
            for (int j = 1; j < 10; j++) {
//                int sum = 0;
//                sum = i * j;
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
