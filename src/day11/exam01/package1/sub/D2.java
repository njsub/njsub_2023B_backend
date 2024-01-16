package day11.exam01.package1.sub;

import day11.exam01.package1.A2;

public class D2 {//같은 패키지
    A2 a1 = new A2(true);   //public 생성자 가능
    //A2 a2 = new A2(1);      //(default) 생성자 가능
    //A2 a3 = new A2("문자열")  // private 생성자 불가능 (오류발생)

    public void method() {
        A2 a = new A2();

        //필드 호출
        a.field1 = 1; // public 가능
        //a.field2 = 1; //(default) 가능
        //a.field3 = 1; // private 불가능

        // 메소드 호출
        a.method1(); //public
        //a.method2(); //default
        //a.method3(); //private 불가능

    }
}