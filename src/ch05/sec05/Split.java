package ch05.sec05;

public class Split {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        //문자열 분리
        String[] toknes = board.split(","); //"1" "자바 학습" "참조 타입 String을 학습합니다." "홍길동"을 배열로 리턴

        //인덱스별로 읽기
        System.out.println("번호 = " + toknes[0]);
        System.out.println("제목 = " + toknes[1]);
        System.out.println("내용 = " + toknes[2]);
        System.out.println("성명 = " + toknes[3]);
        System.out.println();

        //for 문을 이용한 읽기
        for (int i = 0; i < toknes.length; i++) {
            System.out.println(toknes[i]);
        }
    }
}

