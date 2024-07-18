package ch05.question;

public class Q7 {
    public static void main(String[] args) {
        //배열에서 최대값을 구하는 코드를 작성하라
        int[] array = {1, 5, 3, 8, 2};
        int maxNumber = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }

//        for (int i : array) {
//            if (i > maxNumber) {
//                maxNumber = i;
//            }
//        }
        System.out.println(maxNumber);
    }
}
