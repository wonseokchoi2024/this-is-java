package ch05.sec05;

public class IndexOfContains {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";


        //indexOf()는 특정문자열의 위치를 찾아서 주어진 문자열이 시작되는 인덱스를 리턴, 해당 문자열을 없다면 -1을 리턴한다.
        int location = subject.indexOf("프로그래밍");    //3리턴
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location == -1) {
            System.out.println("자바와 관련없는 책입니다");
        } else {
            System.out.println("자바와 관련된 책입니다");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책입니다");
        } else {
            System.out.println("자바와 관련없는 책입니다");
        }

    }
}
