package ch06.sec08.exam03;

//return문
public class Car {
    int gas;

    //가스값을 입력
    void setGas(int gas) {
        this.gas = gas;
    }

    //리턴값이 boolean인 메소드로 gas 필드값이 0이면 false, 0이 아니면 true 리턴
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다");
            return false;
        }
        System.out.println("gas가 있습니다");
        return true;
    }

    //리턴값이 없는 메소드로 gas 필드값이 0이면 return문으로 메소드 종료
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량 = " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량 = " + gas + ")");
                return; //메소드 종료
            }
        }
    }

    //if문을 먼저 사용
    void run2() {
        if (gas > 0) {
            while (gas != 0) {
                System.out.println("가스를 줄입니다 현재 가스는" + gas);
                gas -= 1;
            }
            System.out.println("가스가 0입니다");
        }
    }
}
