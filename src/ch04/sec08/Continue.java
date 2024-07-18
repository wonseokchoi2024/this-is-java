package ch04.sec08;

import java.io.IOException;

public class Continue {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {   //홀수면 다시 반복문으로 돌아감
                continue;
            }
            System.out.println(i + " ");    //홀수는 다시 반복문으로 돌아가기 때문에 print가 안되고 짝수만 출력
        }
    }
}
