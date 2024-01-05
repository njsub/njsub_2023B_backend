package day03; //패키지명

import java.util.Scanner;

public class Step4 { // c s

    public static void main(String[] args) { //m s

    // m s
    Scanner scanner = new Scanner(System.in);



    //if 조건문.
    //1.

        System.out.print("정수 입력 : ");int point = scanner.nextInt();
            //만약에 내가 입력한 값이 저장된 point 변수가
            //80보다 이상이면 (true) 출력문이 실행되고 (false)아니면 실행 안된다.
        if(point >= 80){System.out.println("입력받은 값은 80 이상입니다.");}
        // 2.
        // 만약 내가 입력한 값이 저장된  point변수의
        // 값이 90 이상이면 (true) 합격출력 아니면(false)이면 불합격

        //3.
        if(point >= 90){System.out.println("A등급");}
        else if(point >= 80){System.out.println("C등급");}
            else {
                System.out.println("탈락");
                //vs
                if (point >= 90) {
                    System.out.println("A등급");
                }
                if (point >= 80) {
                    System.out.println("B등급");
                }
                if (point >= 70) {
                    System.out.println("C등급");
                } else {
                    System.out.println("탈락");
                }
            }

        // 4. 중첩 조건
        char sex = 'M';
        if(sex == 'M' || sex == 'm'){
            if(point >= 90) {System.out.println("남자우수상");}
            else{
               if (point >= 90){System.out.println("여자우수상");}
            }
        }


        System.out.print("아이디:"); String id = scanner.next();
        System.out.print("로그인:"); String pw = scanner.next();

        boolean sw = false;
        if(id.equals("admin") && pw.equals("1234")){ sw = true; }
        if(sw){ System.out.println("로그인성공");}
        else{System.out.println("로그인실패");}



        } // m e
} //c e

/*
    if문 [조건문]
        - 경우의 수 (조건) 따른 실행 흐름 제어
        - 조건 : boolean
            - if(true) , if (false)
            - boolean  변수 = true ; if(변수)
            - if(3>5) , if(3>1 && 3<10)
            - int 변수 =10; if (변수 - 10>5)
        - 삼항연산자 :
        - 형태
            1.
                if(조건) {선언문; 실행문;}
            2.
                if(조건) {(참true)선언문; 실행문;}
                else{ (거직false) 선언문; 실행문;}
            3.
                if(조건) {(참true1)선언문; 실행문;} 하나의 조건문으로 취급
                else if(조건2){(참true2)선언문; 실행문;}
                else if(조건3){(참true3)선언문; 실행문;}
                else {(거짓false)선언문; 실행문;}
                    //vs
                - 여러개의 {}실행 : if{} if{} if{} : 여러개의 조건문으로 취급
                if(조건1){(참true1) 선언문; 실행문;}
                if(조건2){(참true2) 선언문; 실행문;}
                if(조건3){(참true3) 선언문; 실행문;}
            4. 중첩
                if (조건1){
                    if(조건1 t -> 조건2) {}
                    else
                }else{
                    if( 조건1 f -> 조건2){}
                    else{}
                }


 */

