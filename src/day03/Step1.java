package day03;

public class Step1 {

    public static void main(String[] args) {

        int x = 10; int y = -10;

        // 1. 산술연산자 ( 결과 : 값 )
        System.out.println(" x + y = " + ( x + y)); //더하기
        System.out.println(" x - y = " + ( x - y)); //빼기
        System.out.println(" x * y = " + ( x * y)); //곱하기
        System.out.println(" x / y = " + ( x / y)); //나누기
        System.out.println(" x % y = " + ( x % y)); //나머지

        // 2. 비교연산자 ( 결과 : boolean )
        System.out.println("x == y = " + (x == y)); //같다
        System.out.println("x != y = " + (x != y)); //같지않다
        System.out.println("x > y = " + (x > y)); //초과
        System.out.println("x >= y = " + (x >= y)); //이상
        System.out.println("x < y = " + (x < y)); //미만
        System.out.println("x <= y = " + (x <= y)); //이하

        //3. 논리연산자 ( 결과 : boolean )
        System.out.println("10< x <20 = " + (x>10 && x >20)); //이면서
        System.out.println("y == 10 또는  == 20 " + (y==10 || y==20)); // 이거나
        System.out.println("x>=30의 반대 :  " + (x>=30)); // 부정

        // 4. 증감 연산자
        System.out.println("x++ :  " + (x++)); // 10출력후 1증가
        System.out.println("x :  " + (x)); //11
        System.out.println("--x : " + (--x)); //1감소후 10출력

        //5. (복합) 대입연산자
        x = 30; // = 오른쪽 값을 왼쪽에 대입
        x += 10; // = x 에 10을 더한후 x에 연산결과대입
        // -= , *= , /= , %=

        // 6. 삼항연산자
            // 조건 ? 참 : 거짓
            // 조건1 ? 참1 : 조건2 ? 참2 : 거짓
            // 조건1 ? 참1 : 조건2 ? 참2 : 조건4 ? 참3 : 거짓
        String 결과 = x >= 90 ? "합격" : "불합격";
        System.out.println("결과 = " + 결과);

        String 결과2 = x >=90 ? "A등급" : x>=80 ? "B등급" : "탈락";
        System.out.println("결과2 = " + 결과2); // soutv 가장가까운 변수 함수 자동완성

        //7. 연결연산자
            // 변수 +"문자열 " , " 문자열 " + "문자열"


    }
}
