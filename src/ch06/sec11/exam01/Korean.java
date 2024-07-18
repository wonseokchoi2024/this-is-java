package ch06.sec11.exam01;

//final필드와 상수
//final필드에 초기값을 대입하는 방법은 1. 필드 선언시 바로 대입, 2. 생성자에서 초기값 대입 2개뿐
public class Korean {
    //인스턴스 final필드 선언
    final String nation = "대한민국";
    final String ssn;

    //인스턴스 필드 선언
    String name;

    //생성자 선언
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
