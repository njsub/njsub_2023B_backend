package day06;

import java.util.Scanner;

public class Step6 {

    public static void main(String[] args) {    // main S
        String 전화번호부 = "";

        Scanner scanner = new Scanner(System.in);






    }   // main E


}   // class E

/*
    비회원제 방문록 프로그램.[JAVA]
        1. 방문록 작성 / 삭제 / 종료 / 출력(현황) 기능 구현
            [ 초기메뉴 ]
            1. 초기메뉴가 반복적으로 실행되어야 한다.  while(true)
                - 특정 조건에 따라 종료.
            2. 초기메뉴 기능 번호에 대해 선택(입력) 받는다. scanner.nextInt();

        2. 방문록 에는 '내용' , '작성자' , '비밀번호' 를 최대 3명만 작성 가능하도록
            - 내용(문자열) , 작성자(문자열) , 비밀번호(정수)
            - 선언해야 할 변수 개수 : 9개

        3. 기능 구현
            [ ] 현재 방문록 현황 출력
                1. 초기메뉴에서 9개 변수를 형식 맞춰 모두 출력.

            [ 1번 선택시 ] 방문록 작성
                1. (1~3) 중 몇번째 방문록에 작성할껀지 선택받기.
                2. 내용 , 작성자 , 비밀번호(숫자4자리) 입력받기.
                3. 선택한 방문록 자리에 입력받은 각 데이터 대입.
            [ 2번 선택시 ] 방문록 삭제
            [ 3번 선택시 ] (반문록) 종료
                1. break 2.return 3.boolean
*/