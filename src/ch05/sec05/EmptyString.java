package ch05.sec05;

public class EmptyString {
    public static void main(String[] args) {
        String hobby = "";   // 빈 String객체 생성
        if(hobby.equals("")) System.out.println("hobby가 참조하는 String객체는 빈 문자열");
        System.out.println(System.identityHashCode(hobby)); //hobby의 메모리주소 확인
    }
}
