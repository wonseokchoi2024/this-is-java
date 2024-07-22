package ch06.sec13.exam02.package1;

//생성자의 접근 제한
public class A {
    //필드 선언
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    //public 접근 제한 생성자 선언(모든패키지에서 생성자 호출)
    public A(boolean b) {
    }

    //default 접근 제한 생성자 선언(같은 패키지에서만 생성자 호출)
    A(int b) {
    }

    //private 접근 제한 생성자 선언(클래스 내부에서만 생성자를 호출)
    private A(String s) {
    }
}
