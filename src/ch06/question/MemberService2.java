package ch06.question;

public class MemberService2 {
    public static void main(String[] args) {
//        Member user1 = new Member("홍길동", "hong", "1234", 20);
        MemberService2 memberService2 = new MemberService2();

        String id;
        String password;

        boolean result = memberService2.login("hong", "12345");

        if (result) {
            System.out.println("로그인 되었습니다");
            memberService2.logout("hong");
        } else {
            System.out.println("id또는 password가 올바르지 않습니다");
        }

        logout("ad"); //static을 넣지 않으면 호출 불가능
    }

    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }

    String logout(String id) {
        return id + "님이 로그아웃 되었습니다";
    }
}
