package day02; //패키지 이름

import java.util.Scanner;

public class Step3 { //c s
    public static void main(String[] args) { // m s
        
            // 1 객체 생성 - 객체를 담는다.
        //new Scanner(System.in);
            // 2 객체 생성했으면 담아야 변수 타입: 객체의 타입에..
        Scanner scanner = new Scanner(System.in);
            // 3 객체를 통한 메소드 사용.
        scanner.nextLine();
            // 4 메소드 호출의 결과 return 저장한다.
        String str = scanner.nextLine();
        System.out.println("str = " + str);

        // scanner 제공하는 메소드
        // 1. 입력받은 문자열string 반환
        String str1 = scanner.next();
        System.out.println("str1 = " + str1);

        //2. 입력받은 문자열(String)반환 띄어쓰기 포함 |주의할점
        scanner.nextLine(); // 의미없는 nextLine()을 추가하기
        String str2 = scanner.nextLine();
        System.out.println("str2 = " + str2);

        //3. 입력받은 논리(Boolean) 반환
        boolean bool = scanner.nextBoolean();
        System.out.println("bool = " + bool);

        //4. 입력받은 바이트반환
        byte b  = scanner.nextByte();
        System.out.println("b = " + b);

        //5. 입력받은 쇼프 반환
        short s = scanner.nextByte();
        System.out.println("s = " + s);

        //6. 입력받은 인트 반환
        int i = scanner.nextInt();
        System.out.println("i = " + i);

        //7. 입력받은 롱 반환
        long l = scanner.nextLong();
        System.out.println("l = " + l);

        //8. 입력받은 플롯 반환
        float f = scanner.nextFloat();
        System.out.println("f = " + f);

        //9. 입력받은 더블 반환
        double d = scanner.nextDouble();
        System.out.println("d = " + d);

        //10. 입력받은 문자 반환 없은 --> "문자열".charAt(추출인덱스): 문자열에서 추출 함수
        char ch = scanner.next().charAt(0); // 첫글자 추출
        System.out.println("ch = " + ch);
        
    } // m e
    
    
} //c e
