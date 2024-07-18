package ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        int dice = (int) (Math.random() * 6) + 1;

//        double dice1 = Math.random();     Math.random()은 double로 기본제공되서 int로 쓰려면 변환해야함

        if (dice == 1) {
            System.out.println("You are 1 dice");
        } else if (dice == 2) {
            System.out.println("You are 2 dice");
        } else if (dice == 3) {
            System.out.println("You are 3 dice");
        } else if (dice == 4) {
            System.out.println("You are 4 dice");
        } else if (dice == 5) {
            System.out.println("You are 5 dice");
        } else {
            System.out.println("You are 6 dice");
        }
    }
}
