package day09;

public class Step1 { //cs

    public static void main(String[] args) { //ms

        //p231
            //필드/메소드를 사용하기 위해서는 꼭 !! 객체가 필요하다
            //calculator.powerOn();
        // 객체생성
        Calculator myCalc = new Calculator(); //객체 생성
        myCalc.powerOn();
        new Calculator().powerOn();

        //3.
        int result1 = myCalc.plus(5,6);
        System.out.println("result1 = " + result1);

        //4
        int x = 10;
        int y = 4;

        double result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2);

        //5
        myCalc.powerOff();

    } //me
} //ce
