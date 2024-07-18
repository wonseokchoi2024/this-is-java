package ch06.sec08.exam02;

/*가변길이 매개변수는 (int ... x)이렇게 사용
매개값들을 자동으로 배열로 변환되어 메소드에서 사용
메소드 호출 시 직접 배열을 매개값으로 사용해도 가능*/
public class Computer {
    //가변길이 매개변수를 갖는 메소드 선언
    int sum(int ... values) {
        int sum = 0;

        //values는 배열 타입의 변수처럼 사용
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        //합산 결과를 리턴
        return sum;
    }
}
