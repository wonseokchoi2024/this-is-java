package ch05.sec04;

public class GarbageObject {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;   // "여행"에 해당하는 String객체를 쓰레기로 만듬

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;   // "자동차"에 해당하는 String객체는 쓰레기가 아님
        System.out.println("kind2 = " + kind2);
    }
}
