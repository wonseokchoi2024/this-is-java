package ch05.sec05;

public class Length {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();
        System.out.println("ssn의 length: " + length);
        if(length == 13) System.out.println("주민등록번호 자릿수가 맞습니다");
            else System.out.println("주민등록번호 자릿수가 틀립니다");
    }
}
