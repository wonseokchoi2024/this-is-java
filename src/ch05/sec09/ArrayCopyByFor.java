package ch05.sec09;

public class ArrayCopyByFor {
    public static void main(String[] args) {
        //자바에서 배열길이를 확정하면 변경 불가능해서 더 큰 길이의 배열을 만들고 복사하기
        int[] oldIntArray = {1, 2, 3};
//        int[] newIntArray = new int[oldIntArray.length+1]; //이렇게도 가능
        int[] newIntArray = new int[5];
        //배열 항목 복사
        for (int i=0; i<oldIntArray.length; i++) {
                newIntArray[i] = oldIntArray[i];
        }
        //배열항목 출력
        for (int i=0; i<newIntArray.length; i++) {
            System.out.println("newIntArray[" + i + "] = " + newIntArray[i]);
        }
    }
}
