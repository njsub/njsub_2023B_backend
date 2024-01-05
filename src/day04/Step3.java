package day04; // 패키지명

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Step3 { // c s

    public static void main(String[] args) { //m cs

        // 입력객체 생성 :
        Scanner scanner = new Scanner(System.in);

        boolean run =true; // 무한 루프 시작
        int speed = 100;
        while (run){
            System.out.println("-----------------------------------------------");
            System.out.println("1. 증속(빠르게) | 2. 감속(느리게) | 3. 중지(멈춤) |");
            System.out.println("-----------------------------------------------");
            System.out.print("선택 : ");

            String strNum = scanner.nextLine(); // 엔터를 입력할때까지 함수

            if (strNum.equals("1")){ // 만약에 입력받은 값(문자열) 문자1이면 [문자비교시에는 equals()]
                speed++; // 변수 값 연산
                System.out.println("현재속도 = " +speed); // 변수 값 출력
            } else if (strNum.equals("2")) { // 만약에 입력 받은 값이 문자 2이면
                speed--; // 변수 값 연산
                System.out.println("현재속도 =" +speed); // 변
            } else if (strNum.equals("3")) {
                run = false;
            }

        }

        System.out.println("프로그램 종료");

    } // m e
} // c e
