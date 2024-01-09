package day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Step2 {

    public static void main(String[] args) {

        //1. 문자열 선언 : String 클래스 사용
        String name; // 스택영역 선언
        name = "홍길동"; // 힙영역 주소대입
        //||같다.
        String hobby = "여행"; // 힙영역의 주소를 스택영역에 대입


        //1
        String name1 = "홍길동"; // 리터럴을 사용하면 동일하고 new를 사용하면 다르다.
        String name2 = "홍길동";
        System.out.println(name1 == name2);

        //2
        String name3 = new String("홍길동");
        System.out.println( name2 == name3);

        //3 접근연산자
        System.out.println( name1.equals(name2)); //같다 //equals는 비교메소드이구나. ==대신 사용함
        System.out.println( name2.equals(name3)); //같다. [스택이  가지는 주소/ 참조의 내부 비교] 스택이 가지는 주소를 비교하는군

        //4
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();

        System.out.println( name1 == inputName);
        System.out.println( name1.equals(inputName));
        //5
        String hobby2 = "";
        if(hobby2.equals("")){
            System.out.println("hobby변수가 참조하는 String 객체는 빈 문자열.");
        }

        String hobby3 = null;
        if ( hobby3 != null && hobby3.equals("")){
            System.out.println("문자열 객체가 존재하면서 문자열 비교");
            //.NullPointerException //
        }

    }//me
}//ce
