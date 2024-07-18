package ch04.sec04;

public class FloatCounter {
    public static void main(String[] args) {
        for (float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }

        System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");

        for (double y=0.1; y<=1.0; y+=0.1) {
            System.out.println(y);
        }

    }
}
