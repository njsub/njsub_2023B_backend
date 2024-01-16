package day10;

import java.util.AbstractCollection;
import java.util.Scanner;

public class BankApplication2 {

    //클래스멤버
    //1. 필드
    // 여러개의 account 객체를 저장하는 배열
    static Account2[] account2s = new Account2[100];

    // main() 함수 아닌 main() 밖에 정적필드로 선언하는 이유 : 여럿 함수에서 사용할려고
    static Scanner scanner = new Scanner(System.in);

    //2.생성자
    //3.메소드1
    static void 계좌생성() {
        System.out.println("BankApplication2.계좌생성");
        //1.입력받기 // *Account 객체 만들어서 배열에 저장 하기 위한 목적
        System.out.print("계좌번호 : ");
        String 계좌번호 = scanner.next();
        System.out.print("계좌주 : ");
        String 계좌주 = scanner.next();
        System.out.print("초기입금액 : ");
        int 초기입금액 = scanner.nextInt();

        //2. 객체 생성
        //1. 풀생성자 사용했을 때
        Account2 account2 = new Account2(계좌번호, 계좌주, 초기입금액);
        //2. 빈생성자 사용했을 때 [ 권장하지 않음 > 생성자 또는 메소드를 통한 필드 사용
        //Account acconunt - new Account();
        //account.계좌번호;
        //account.계좌주;
        //account.초기입금액;
        //3. 객체를 배열에 넣는다.
        //정적 메소드에서는 인스턴스필드를 호출할 수 없다.
        //1. 인스턴스필드를 static한다.
        //2. 객체생성한다?"???[x]
        for (int i = 0; i < account2s.length; i++) {
            if (account2s[i] == null) {// 만약에 비어 있으면 객체 저장
                account2s[i] = account2;
                break;

            }//if e
        }//f e
    }
        static void 계좌목록(){ //3. 계좌목록
            System.out.println("BankApplication2.계좌목록");
            //*배열내 반복문을 이용한 모든 계좌객체를 호출
            for(int i =0 ; i < account2s.length; i++){
                Account2 account2 = account2s[i];
                if(account2 == null) break;
                System.out.printf("%10s \t %5s \t %10d \n" , account2.계좌번호, account2.계좌주, account2.입금액 );
            }
        } //f e
        static void 예금(){
            System.out.println("BankApplication2.출금");
            //*입력받은 계좌번호가 계좌번호의 객체가 없으면 해당 객체내 입금액을 더한다.
            //1. 입력받는다.
            System.out.println("예금 계좌번호 : "); String 계좌번호  = scanner.next();
            System.out.println("예금 예금액 : "); int 예금액 = scanner.nextInt();
            //2. 계좌목록 / 배열 에서 입력한 계좌찾는다.
            for (int i = 0 ; i < account2s.length ; i++){
                Account2 account2 = account2s[i];
                if ( account2 == null) break;
                //만약에 동일한 계좌번호의 객체가 있으면 해당 객체내 입금액을 더한다.
                if ( account2.계좌번호.equals(계좌번호)){ account2.입금액+=예금액; break;}

            }

        }//f e
        static void 출금() {//5. 출금
            System.out.println("BankApplication2.출금");
            // *입력받은 계좌번호가 계좌목록에 존해하면 출금액을 찾은 계좌객체에서 예금을 뺀다.
            System.out.println("예금 계좌번호 : "); String 계좌번호 = scanner.next();
            System.out.println("예금 예금액 : "); int 출금액 = scanner.nextInt();
            //2. 계좌목록 / 배열에서 입력한 계좌를 찾는다.
            for(int i= 0 ; i < account2s.length; i++){
                Account2 account2 = account2s[i];
                if( account2 == null) break;
                // 만약에 동일한 계좌번호의 객체가 있으면 해당 객체내 입금액을 더한다.
                if( account2.계좌번호.equals(계좌번호)){ account2.입금액 -= 출금액; break;}

            }
        }//f e

    public static void main(String[] args) { // 1. 실행 시작점.
        while (true){
            System.out.println("--------------------------");
            System.out.println("1계좌생성 | 2계좌목록 | 3예금 | 4출금 | 5종료");
            System.out.print("선택>>");
            int ch = scanner.nextInt();

            if (ch == 1 ){계좌생성();}
            else if (ch == 2) { 계좌목록();}
            else if (ch == 3) { 예금();}
            else if (ch == 4) { 출금();}
            else if (ch == 5) { System.out.println( "프로그램 종료" ); break;}
        }//w e

    }//me


}//ce
