package ch04.question;

public class Q4 {
    public static void main(String[] args) {


        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int diceSum = dice1 + dice2;

            System.out.println("1번주사위 값 = " + dice1 + "// 2번 주사위 값 = " + dice2 + "// 주사위의 총합 = " + diceSum);

            if (diceSum == 5) {
                System.out.println("주사위의 합이 5가 나왔습니다!");
                break;
            }

        }

    }
}
