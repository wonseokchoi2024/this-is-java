package ch06.sec10.exam03;

//인스턴스 멤버 사용 불가, 정적멤버에서는 this사용 불가
public class Car {
    //인스턴스 필드 선언
    int speed;
    //인스턴스 메소드 선언
    void run() {
        System.out.println(speed + "으로 달립니다");
    }

    static void simulate() {
        //객체 생성 static 메서드에서 정적멤버는 사용 가능한데 인스턴스 멤버는 불가능 하기 때문에 객체를 생성해서 인스턴스 멤버에 접근
        Car myCar = new Car();
        //인스턴스 멤버 사용
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        //정적 메소드 호출
        simulate();

        //객체 생성
        Car myCar = new Car();
        //인스턴스 멤버 사용
        myCar.speed = 60;
        myCar.run();
    }
}
