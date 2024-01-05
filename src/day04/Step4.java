package day04; //패키지명


import java.util.Scanner;

public class Step4 { // c s


    // p. 139 확인문제 7

    public static void main(String[] args) { //m s

        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        int money = 0;

        while (true){ // w s
            System.out.println("---------------------------------");
            System.out.println("1.예금   2.출금    3.잔고    4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택>");

            int ch = scanner.nextInt();

            if ( ch == 1){
                System.out.print("예금액>");
                int inMoney = scanner.nextInt();
                money += inMoney;
            }

            if ( ch == 2){
                System.out.print("예금액>");
                int outMoney = scanner.nextInt();
                money += outMoney;
            }

            if ( ch == 3){
                System.out.println("잔고>"+money);
            }

            if ( ch == 4){
                System.out.println("프로그램종료");
                break;
            }

        } // w e


    } // m e
} // c e

/*
    은행 프로그램 구현
        [요구사항 설계]
        1. 반복적으로 기능 사용 [ 단* 종료 기능 선택시 종료]
        2. 기능 : 예금 , 출금 , 잔고, 종료
            예금 : 더하기 작업 - 금액에서 예금액을 입력받아 금액에 더한다.
            출금 : 빼기 작업 - 금액에서 출금액을 입력받아 금액에서 뺀다
            잔고 : 확인 작업 - 금액의 값을 출력한다.
            종료 : 프로그램을 끝내는 작업 - 무한루프를 탈출한다. 1. 스위치변수 2.break 3.return -상황에 따라
        3. 데이터 설계
            금액 : 예금 , 출금 했을때 누적으로 저장.
 */