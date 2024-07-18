package ch05.sec03;

public class ReferenceVariableCompare {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] { 1, 2, 3};        //배열 { 1, 2, 3}을 생성하고 arr1변수에 대입
        arr2 = new int[] { 1, 2, 3 };       //배열 { 1, 2, 3}을 생성하고 arr2변수에 대입
        arr3 = arr2;

        System.out.println(arr1 == arr2);

        System.out.println(arr2 == arr3);
    }
}
