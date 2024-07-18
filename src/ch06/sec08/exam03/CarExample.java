package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //리턴값이 없는 setGas()메소드 호출해서 값 입력
        myCar.setGas(5);

        //isLeftGas 호출해서 받은 리턴값이 true일 경우 if 블록 실행
        if (myCar.isLeftGas()) {    //gas가 0이면 false, 아니면 true
            System.out.println("출발합니다");

            //리턴값이 없는 run()메소드 호출
            myCar.run();    //gas가 0이 아니라서 -1씩 함
        }

        System.out.println("gas를 주입하세요");
    }
}
