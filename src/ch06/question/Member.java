package ch06.question;

public class Member {
    //필드 선언
    String name;
    String id;
    String password;
    int age;

    //생성자 선언
    Member(String name) {
        this.name = name;
    }

    Member(String name, String id) {
        this(name, id, "", 0);
    }

    Member(String name, String id, String password) {
        this(name, id, password, 0);
    }

    Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

//    Member(String name, String id) {
//        this.name = name;
//        this.id = id;
}
