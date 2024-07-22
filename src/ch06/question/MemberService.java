package ch06.question;

public class MemberService {
    String id;
    String password;

    boolean loing(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }

}
