package day11.exam01.package1;

public class A2{

// *필드와 메소드 접근제한자
public int field1;
int field2;
private int field3;

public A2(){
    field1 = 1 ;
    field2 = 1 ;
    field3 = 1 ;

    method1();
    method2();
    method3();

}

//메소드 접근자
    public void method1(){}
    void method2(){}
    private void method3(){}

    public A2(boolean b){}
    A2 a1 = new A2( true);

    A2(int b){}
    A2 a2 = new A2( 1);

    private A2(String s){}
    A2 a3 = new A2( "문자열");
}
