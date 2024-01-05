package day02; // 현재 클래스파일 위치의 패키지명

public class Step1 { // 자바의 모든 코드는 클래스 안에서 작성. // class s

    public static void main(String[] args) { // mian()함수 : main스레드 포함 // main s
        //System.out.println(); // 3. 콘솔 출력 함수

        // 4. 실행(콘트롤 시프트 f10 = 실행한다 = 컴파일한다 = out폴더로 간다.)
        /*
            src폴더내 Step1 클래스 파일 생성 [ .java]
                실행(콘트롤 시프트 f10) , 컴파일[javac]
            자동으로 out 폴더내 Step1 클래스 파일 생성[ .class]
         */

        // p.53 자동타입 변환
            // 1. 작은 타입 허용범위가 큰 타입 허용범위내 대입될 때
            // byte < short, char < int < long < float < double
            // 큰 타입 = 작은 타입 (신경쓸필요없다. 자동으로 해주기 떄문)


        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue:" + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 : " +intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : " +longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue:" +floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue:" +doubleValue);

        // p.55 강제타입 변환 = 캐스팅 =
                // 1. 큰 타입 허용범위가 작은 타입 허용 범위내 대입될 때 (중요)
                // byte < short, char < int < long < float < double
                // 2. 데이터 손실(목적 : 원래 값이 유지되면서 타임만 바꾸는 것) , 소괄호()를 이용해서 변환할 타입을 명시한다.(중요)
                // 작은타입 = (작은타입) 큰 타입

        int var1 = 130;
        byte var2 = (byte)var1; // int -> byte (강제)
        System.out.println("var2 : " + var2);
        System.out.println("var1 : " + var1);

        long var3 = 300;
        int var4 = (int)var3;
        System.out.println("var4:" +var3);

        int var5 = 65;
        char var6 = (char)var5;
        System.out.println("var6:" + var6);

        double var7 = 3.99;
        int var8 = (int)var7;
        System.out.println("var8:" + var8);

        int result = (int)(30000*0.1);
            //1. (int * double) = > 연산결과는 double
            //2. 연산결과의 타입은 자동타입변환

        //p.58 연산식에서 자동 타입변환 (중요 : 결과는 더큰 허용범위의 타입을 가진다.)
            // 1. byte, short 연산시 결과 타입이 int
            // 2. int , int => int
            // 3. long, int => long
            // 4. float, float => float
            // 5. double , float => double

        //p.62
        byte result1 = 10+20; // 컴파일 연산.

        byte v1 =10;
        byte v2 =20;
        int result2 = v1 +v2; // byte + byte => int

        byte v3 = 10; int v4 = 100; long v5 = 1000L;
        long result3 = v3 + v4 + v5; // byte + int => int + long => long

        char v6 = 'A'; char v7 = 1;
        int reslut4 = v6+v7; //char + char => int

        int v8 = 10;
        int result5 = v8 / 10; // int / int => int

        int v9 = 10;
        double result6 = v9 / 4.0; // int  / double => double

        int v10 = 1;
        int v11 = 2;
        double result7 = v10/v11; // int / int => (캐스팅) 해서 소수점 표현 하자.
       // int result7 = v10/v11; // int / int => int [문제없음 - 소수점 표현이 불가능 해짐.




    } //main e
} //class e






/*
    타입
        종류 : 1.기본타입 : 8가지 기본적으로 제공하는 타입
              2.참조타입 : 기본 타입 외에는 모두 타입이라고 보면 된다.

    기본타입 8가지
        [논리]
        boolean     1바이트    true false

        [정수] int
        byte        1바이트    -128 ~ 127
        short       2바이트    +- 32,000
        int         4바이트    +- 21억
        long        8바이트    +- 21억 이상

        [실수] double
//        float       4바이트    유효소수점 7자리 , 8자리 출력
        double      8바이트    유효소수점 15자리 , 16자리 출력

        [문자]
        cha         2바이트    유니코드 65535

        [문자열]
        +String     문자길이   영문1바이트 한글2바이트
*/