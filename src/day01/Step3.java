package day01; // 패키지명

public class Step3 { // class s

    public static void main(String[] args) {//main() 함수 main s

        //p.41 진수 표현하는 방법
        int var1 = 0b1011; // 2진수 : 데이터아페 0b 1011[2] -> 11[10]
        System.out.println("var1 : " + var1);

        int var2 = 0206; // 8진수 : 데이터 앞에 0 206[8]
        System.out.println("var2 : " + var2);

        int var3 = 365;
        System.out.println("var3 : " + var3);

        int var4 = 0xb3;
        System.out.println("var4 : " + var4);

        //[p.42] byte타입 [-128 ~ 127] : 1바이트 => 8bit -> 1[부호]+7[값] -> 2의 7승
        byte b1 = -128; System.out.println("b1:"+b1);
        byte b2 =127; System.out.println("b2:"+b2);
        //byte b3 =200; System.out.println("b2:"+b2); 허용범위 벗어남.
            //java: incompatible types: possible lossy conversion from int to byte

        // short타입[-32768 ~ 32767] : 2바이트 +> 16bit
        short s1 = 32000; System.out.println("s1:"+s1);
        //short s2 = -50000; System.out.println("s1:"+s2); 허용범위 벗어남
            //java: incompatible types: possible lossy conversion from int to short

        //*int타입 [+_21억정도] : 4바이트
        int i1 = 2000000000; System.out.println("i1:" +i1);
        //int i2 = 3000000000; System.out.println("i1:" +i2);
        //java: integer number too large

        // long타입[+-21억이상] : 8바이트 : !!!:
        long l1 = 3000000000L; System.out.println("L1:" +l1);

        //p.43 char
        char c1 = 'A';  System.out.println("c1:"+c1);
        char c2 = '가';  System.out.println("c2:"+c2);
        //char c3 = "가";  System.out.println("c3:"+c3);
            //java: incompatible types: java.lang.String cannot be converted to char
            //1. ch14 a 왜 정수형타입이 가능한지??
        int i3 = 'A';  System.out.println("i3:" + i3);
        int i4 = '가';  System.out.println("i4:" + i4);

        char c4 = 81;  System.out.println("c4:" + c4);

        //p.49 문자열 ""큰따옴표 , 참조타입//클래스 , " " 사용 , JDK13이상 """ """ 사용가능
        String str1 = "안녕하세요"; System.out.println("str1:"+str1);
        String str2 = "나는 \"자바\"를 배웁니다"; System.out.println("str2:"+str2);
        String str3 = "번호\t이름\t직업"; System.out.println("str3:"+str3);
        String str4 = """
                      나는 자바를
                      학습합니다.
                      나는 자바 고수가 될 겁니다.
                      """;                      System.out.println("str4:"+str4);


        // float [p.45] 실수타입 7자리유효
        float f1 = 0.123456789123456789f; System.out.println("f1:"+f1);

        //double
        double d1 = 0.123456789123456789; System.out.println("d1:"+d1);

        //boolean
        boolean bool1 = true;
        //boolean bool2 = 1; 1은 int 이므로 boolean에 저장할 수 없다, [정수 가장 최소단위 바이트]
        //System.out.println(bool1 +1);

    } // main e



}//class e
