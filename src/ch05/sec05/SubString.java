package ch05.sec05;

public class SubString {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
                    //0123456789

        //substring(a, b) = a지점포함 ~ b지점 앞까지 잘라냄
        String firstNum = ssn.substring(2, 6); // 2번 인덱스에서 5번까지
        System.out.println(firstNum);

        //substring(x) = 인덱스x번부터 끝까지 잘라냄
        String secondNum = ssn.substring(7); // 7번인덱스에서 끝까지 잘라냄
        System.out.println(secondNum);
    }
}
