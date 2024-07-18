package ch05.sec05;

public class Equals {
    public static void main(String[] args) {
        String strVar1 = "홍길동";     //같은 문자열을 사용하기 때문에 같은 번지의 값이 변수에 대입됨
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {   // 참조하는 번지가 같은지를 비교
            System.out.println("strVar1 and strVar2 are the same");
        } else {
            System.out.println("strVar1 and strVar2 are not the same");
        }

        if(strVar1.equals(strVar2)) {   // 참조하는 번지를 비교하는게 아니라 내부의 문자열이 같은지 비교
            System.out.println("strVar1 and strVar2는 참조하는 번지는 다를수 있어도 문자열은 같음");
        }

        String strVar3 = new String("홍길동"); // 새로운 String객체를 생성하기 때문에 둘다 다른 객체번지를 가지게 됨
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {   //참조하는 번지가 같은지를 비교
            System.out.println("strVar3 and strVar4 are the same");
        } else {
            System.out.println("strVar3 and strVar4 are not the same");
        }

        if(strVar3.equals(strVar4)) {       // 참조하는 번지비교x 내부 문자열이 같은지 비교
            System.out.println("strVar3와 strVar4의 내부 문자열이 같음");
        }

    }
}
