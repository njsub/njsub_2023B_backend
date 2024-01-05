package day03; //패키지명

import java.util.Scanner;

public class Step2 { //c s

    public static void main(String[] args) { // m s
        //객체사용이유
        Scanner scanner = new Scanner(System.in);


        // 예제1 : 작성자 , 내용 , 날짜 3가지를 입력받아 출력
            //1입력
//        System.out.print("작성자 : ");   String 작성자 = scanner.next();
//        System.out.print("내용 : ");   String 내용 = scanner.next();
//        System.out.print("날짜 : ");   String 날짜 = scanner.next();
//
//            //2입력받은 데이터 출력
//        System.out.printf("============ 방문록 =============\n");
//        System.out.printf("%4s %10s %20s %10s \n" , "번호" , "작성자" , "내용" , "날짜");
//        System.out.printf("%5d %10s %20s %10s \n" , "번호" , "작성자" , "내용" , "날짜");


        // 예제2 : 기본급 과 수당 정수로 입력받아 실수령액 계산해서 출력
            // 실수령액 : 기본급 + 수당 - 세금 [기본급10%]

        //1입력
        System.out.print("기본급 : "); int 기본급 = scanner.nextInt();
        System.out.print("수당 : "); int 수당 = scanner.nextInt();
        //2처리
        int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1); // % : 나머지 연산자
            // 오류 나는 이유 : int = int + int - int *doouble => double
                // 0.1 double형 이므로 int*double 의 결과는 double 그래서 더블을 int에 대입할 수 없다 -> 강제 캐스팅.
        //출력
        System.out.println("실수령액 = " + 실수령액 +"원");


    } // m e


} // c e
