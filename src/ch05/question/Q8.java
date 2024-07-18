package ch05.question;

public class Q8 {
    public static void main(String[] args) {
        //배열항목의 전체 합과 평균을 구하기
        int sum = 0;
        int number = 0;
        double avg = 0.0;

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        //최신 코드
        for (int[] a : array) {
//            number += a.length;  아래가 더 효율적
            for (int b : a) {
                sum += b;
                number++;
            }
        }

        //옛날 코드
//        for (int i = 0; i < array.length; i++) {
//            number += array[i].length;
//            for (int j = 0; j < array[i].length; j++) {
//                sum += array[i][j];
//            }
//        }


        avg = (double) sum / number;
        System.out.println("전체 합 = " + sum);
        System.out.println("전체 평균 = " + avg);
    }
}
