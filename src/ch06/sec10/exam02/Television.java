package ch06.sec10.exam02;


//정적 블록 static 블록
public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
