package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        //생성자에 매개변수 옵션을 만들었기 때문에 new Car()이렇게 하면 안됨
        Car car1 = new Car("소나타");
        Car car2 = new Car("그랜저");

        car1.run();
        car2.run();

    }
}
