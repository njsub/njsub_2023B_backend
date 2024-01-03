package day01; // 현재파일의 패키지(폴더) 위치

public class Step1 { // 클래스 선언  //클래스 스타트 class start
    // public class : 클래스 선언
    // 클래스명 : Step1
        // *숫자시작 안됨 , 공백 안됨 , 첫글자 대문자!! 꼭!!
    // {} : 클래스 블록/지역/정의하는 곳
    public static void main(String[] args) {//main start

        // main : main() 메소드
        // {} : 메소드 블록/지역/정의하는곳
        // *실행하면 main() 메소드 블록이 실행된다. [프로그램의 진입/시작점]
            // - 실행[선언/정의 말고]은 무조건 main() 안에서 시작된다.
            // - main() 안에 main 스레드[코드를 읽는 흐름] 포함 -- JS에서는 브라우저읽음 자바에서는 쓰레드읽음
        System.out.println("여기는 콘솔"); //<---> 콘솔에 출력하는 코드[js:consol.log]

        // 한줄 주석
        /* 여러줄 주석 */

        // 실행문 : 1. 변수선언, 2. 변수대입 3. 메소드호출
            // 코드마다 ; 끝마침!![ 생략시 오류 : java: ';' expected]

    } // main end
} // 클래스 엔드 class end
