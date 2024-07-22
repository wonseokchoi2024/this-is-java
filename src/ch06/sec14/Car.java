package ch06.sec14;

//Getter와 Setter
public class Car {
    //필드 선언
    private int speed;
    private boolean stop;

    //speed필드의 Getter/Setter선언
    public int getSpeed() {     //Getter는 앞에 get을 붙임
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    //stop필드의 Getter/Setter 선언
    public boolean isStop() {   //필드 타입이 boolean일 경우에 Getter는 get이 아니라 is로 시작
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true) this.speed = 0;
    }
}
