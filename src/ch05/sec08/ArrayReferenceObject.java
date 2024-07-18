package ch05.sec08;

public class ArrayReferenceObject {
    public static void main(String[] args) {
        //배열에서 객체 내부에서 값을 비교
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String ("Java");  // 배열[2]에 새로운 "Java"라는 새로운 객체를 생성

        System.out.println( strArray[0] == strArray[1] );
        System.out.println( strArray[0] == strArray[2] );   //참조값이 다름
        System.out.println( strArray[0].equals(strArray[2]) );  //문자열만 비교해서 true

    }
}
