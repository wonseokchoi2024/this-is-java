package ch05.sec06;

public class ArrayCreateByNew {
    public static void main(String[] args) {
        //배열 변수 선언과 배열 생성
        int[] arr1 = new int[3]; //길이가 3인 배열 생성
        //배열 항목의 초기값 출력
        for (int i = 0; i < 3; i++) {
            System.out.print("arr1[" + i + "] = " + arr1[i] + ", ");
        }
        System.out.println();
        //배열 항목의 값 변경
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        //배열 항목의 변경 값 ㅜㅊㄹ력
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("arr1[" + i + "] = " + arr1[i] + ", ");
        }
        System.out.println("\n");

        //배열 변수 선언과 배열 생성
        double[] arr2 = new double[3];
        //배열 항목의 초기값 출력
        for (int i=0; i<arr2.length; i++) {
            System.out.print("arr2[" + i + "] = " + arr2[i] + ", ");
        }
        System.out.println();
        //배열 항목의 값 변경
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        //배열 항목의 변경 값 출력
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("arr2[" + i + "] = " + arr2[i] + ", ");
        }
        System.out.println("\n");

        String[] arr3 = new String[3];
        for (int i=0; i<arr3.length; i++) {
            System.out.print("arr3[" + i + "] = " + arr3[i] + ", ");
        }
        System.out.println();
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("arr3[" + i + "] = " + arr3[i] + ", ");
        }
    }
}
