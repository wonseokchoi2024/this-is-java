package ch05.sec07;

public class MultidimensionalArrayByValueList {
    public static void main(String[] args) {
        //2차원 배열 생성
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        //전체 배열 길이
        System.out.println(scores.length);

        //1차원배열의 인덱스0
        for (int i = 0; i < scores[0].length; i++) {
            System.out.println("1차원배열의 0인덱스[" + i + "]의 값은 = " + scores[0][i]);
        }
        System.out.println();
        //1차원배열의 인덱스1
        for (int i = 0; i < scores[1].length; i++) {
            System.out.println("1차원배열의 1인덱스[" + i + "]의 값은 = " + scores[0][i]);
        }
        System.out.println();

        //1-1 평균점수
        int sum1_1 = 0;
        double avg1_1 = 0.0;
        for (int i = 0; i < scores[0].length; i++) {
             sum1_1 += scores[0][i];
        }
        avg1_1 = (double) sum1_1 / scores[0].length;
        System.out.println("1-1의 총점은 = " + sum1_1);
        System.out.println("1-1의 평균점수는 = " + avg1_1 + "\n");

        //1-2 평균점수
        int sum1_2 = 0;
        double avg1_2 = 0.0;
        for (int i = 0; i < scores[1].length; i++) {
            sum1_2 += scores[1][i];
        }
        avg1_2 = (double) sum1_2 / scores[1].length;
        System.out.println("1-2의 총점은 = " + sum1_2);
        System.out.println("1-2의 평균점수는 = " + avg1_2 + "\n");

        //전체 평균점수
        int sum_total_score = 0;
        int sum_total_index = 0;
        double avg_total = 0.0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sum_total_score += scores[i][j];
            }
            sum_total_index += scores[i].length;
        }
        avg_total = (double) sum_total_score / sum_total_index;
        System.out.println("전체 총점은 = " + sum_total_score);
        System.out.println("전체 인덱스의 개수는 = " + sum_total_index);
        System.out.println("전체 평균은 = " + avg_total);
    }
}
