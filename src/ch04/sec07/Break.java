package ch04.sec07;

public class Break {
    public static void main(String[] args) throws Exception {

        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for(char lower='a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break;
                }
            }
        }

        System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");

        Outter: //라벨을 생성
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for(char lower='a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break Outter;   //break;로 끝나면 lower for문이 끝나지만 break 라벨을 해서 위의 Outter가 있는 라인으로 break됨
                }
            }
        }

        System.out.println("프로그램 종료");

    }
}
