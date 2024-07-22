package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {


        //private 생성자라서 new연산자로 객체 생성 불가능
/*
    Singleton singleton1 = new Singleton();
    Singleton singleton2 = new Singleton();
*/

        //정적 메소도를 통해 객체 생성
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        //동일한 객체를 참조하는지 확인
        if (singleton1 == singleton2) {
            System.out.println("같은 객체를 참조합니다");
        } else {
            System.out.println("다른 객체를 참조합니다");
        }

    }
}
