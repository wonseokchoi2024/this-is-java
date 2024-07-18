package ch06.sec08.exam04;

//메소드 오버로딩은 이름만 같으면 됨, 리턴타입이나 매개변수의 순서 개수 타입이 달라도 됨
public class Calculator {
    //정사각형의 넓이
    double areaRectangle(double width) {
        return width * width;
    }

    //직사각형의 넓이
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
