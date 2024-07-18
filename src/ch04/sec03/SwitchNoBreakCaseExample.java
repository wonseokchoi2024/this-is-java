package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;   //8~11 정수 뽑기
        System.out.println("현재 시간 = " + time + "시");


        //8이 나오면 처음부터 다 출력돼서 11이 나오면 마지막만 출력
        switch (time) {
            case 8:
                System.out.println("출근합니다");
            case 9:
                System.out.println("회의합니다");
            case 10:
                System.out.println("업무합니다");
            default:
                System.out.println("점심시간");

        }
    }
}
