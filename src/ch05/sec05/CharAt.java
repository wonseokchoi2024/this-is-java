package ch05.sec05;

public class CharAt {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);   //해당 변수의 주어진 인덱스를 리턴 (0 ~ 문자길이-1)
        switch (sex) {
            case '1', '3' -> System.out.println("남자입니다");
            case '2', '4' -> System.out.println("여자입니다");
        }
        System.out.println("sex의 return값은 = " + sex);
    }
}
