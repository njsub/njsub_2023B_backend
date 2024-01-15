package day10;




// 클래스 사용목적 : 1. 라이브러리(설계도) 클래스 2. 실행클래스

public class Step1 { //cs

    public static void main(String[] args) { //ms

        // 객체생성
            //클래스명 변수명 = new 클래스명();
        캐릭터 user1 = new 캐릭터( "자바맨");
        캐릭터 user2 = new 캐릭터( "클래스맨");
        System.out.println("user1.toString() = " + user1.toString());
        System.out.println("user2.닉네임 = " + user2.닉네임);

        // 필드사용
        user1.직업 = "마법사";
        user1.직업 = "전사";
        System.out.println("user1.toString() = " + user1.toString());
        System.out.println("user2.toString() = " + user2.toString());

        // 메소드 호출
        System.out.println("user1.toString() = " + user1.toString());
        user2.공격();
        System.out.println("user2.toString() = " + user2.toString());



    } //me
} //ce
