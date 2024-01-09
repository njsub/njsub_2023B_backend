package day06;

import java.util.Scanner;

public class Step3 {

    public static void main(String[] args) {

        // 문자
        // 문자 추출

        String ssn = "9506242230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }//se

        //== 문자입력받기
       // Scanner scanner = new Scanner(System.in);
       // char c = scanner.next().charAt(0);

        //1문자열 추출 문자열에서 특정 문자 검색
        String str = "안녕하세요";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            System.out.println();
        }
        //2문자열길이
        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
        //3문자열대체
        String oldStr = " 자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace( "자바" ,"JAVA");

        System.out.println( oldStr);
        System.out.println( newStr);

        //4문자열 잘라내기 : 문자열 .subString()
            //매개변수 : (1)(2)시작 인덱스 , 끝인덱스 / 반환타입 : 잘라낸 문자열 추출 String
        String ssn2 = "880815-1234567";
        String firstNum = ssn2.substring(0,6); // 0~5인덱스 추출
        System.out.println("firstNum =" + firstNum);

        String secondNum = ssn2.substring(7);
        System.out.println("secondNum =" + secondNum);

        //5. 문자열 찾기 : 문자열.indexof()
            //매개변수 : 찾을문자열 / 반환값 : 찾은문자열의 인덱스 번호
        String subject = "자바 프로그래밍";

        // 자바 프로그래밍 문자열에서 프로그래밍 문자열 찾기
        int location = subject.indexOf("프로그래밍");
        System.out.println("location =" + location);

        // 자바 프로그래밍 문자열에서 3번 인덱스 부터 끝까지 문자열 잘라내기
        String substring = subject.substring(location);

        //----------//
        location = subject.indexOf("자바");
        if(location != -1) {
            System.out.println("자바와 관련된 책이군요.");
        }else System.out.println("자바와 관련없는 책이군요.");

        // 6. 문자열 분리 : 문자열.split()
            //매개변수 : 구분자 // 반환타입 : 배열(문자열[])

        String board = "1,자바 학습,참조 타입 String을 학습니다.,홍길동"; //4조각으로 문자열이 분리
        String[] tokens = board.split(",");
        //1
        System.out.println("번호 : " + tokens[0]);
        System.out.println("제목 : " + tokens[1]);
        System.out.println("내용 : " + tokens[2]);
        System.out.println("성명 : " + tokens[3]);
        //2
        for(int i= 0 ; i < tokens.length; i++){
            System.out.println(tokens[i]);

        }


    }//me
}//ce
