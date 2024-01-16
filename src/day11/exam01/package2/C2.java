package day11.exam01.package2;

import day11.exam01.package1.A2;

public class C2 {
    //다른패키지
    A2 a1 = new A2(true);       //public 가능
    //A2 a2 = new A2(1);          //default 불가능
    //A2 a3 = new A2("문자열");    //private 불가능

    // p.268
    public void method(){
    A2 a = new A2();
    //필드호출
        a.field1 = 1;
        //a.field2 = 1;
        //a.field3 = 1;

        a.method1();
        //a.method2();
        //a.method3();
    }
}
