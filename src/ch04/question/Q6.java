package ch04.question;

public class Q6 {
    public static void main(String[] args) {
//        String star = "";
////        String star;  //선언만하고 값을 초기화 하지 않아서 안됨 초기화 하지 않으면 값을 못넣음
//        for (int x = 0; x < 5; x++) {
//            star += "*";
//            System.out.println(star);
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if (i == j) {
                    System.out.println("");
                }
            }
        }


        //선언만하고 값 초기화 안하면 값이 안들어가는 test
//        int t;
//        for (int a = 0 ; a < 5; a++) {
//            t += a;
//            System.out.println(t);
//        }
    }
}
