package ch05.sec04;

public class NullPointerException {
    public static void main(String[] args) {
        int[] intArray = null;
//        intArray[0] = 10;   //NullPointerException에러
                            //배열을 선언만 하고 해당 변수에 값이 없다는 뜻인 null이라서
                            //참조하는 배열 객체가 없으므로 값 저장이 불가능

        String str = null;
//        System.out.println("str의 총 문자길이 = " + str.length());  //NullPointerException 에러
        /*.lenth()메서드를 호출 하려고 해도 str변수에는 값이 없기 때문에 문자열 길이 구분이 불가능
        즉 str변수가 참조하는 String객체가 없다*/
    }
}
