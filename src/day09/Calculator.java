package day09;

public class Calculator {
    //클래스멤버
        //1필드 무엇을
        //2생성자 초기화 태생후 않쓴다
        //3메소드 행위값
            //1리턴타입
            //2함수명
            //3(매매변수,매개변수)
            //4{명령문}
            //5return 함수종료키워드
                //void이면 return void아니면 return 값;
                    // 값은 메소드선언시 리턴타입 정의한 타입과 일치
    void powerOn(){
        //void 메소드가 호출한 곳으로 전달하는 결과값이 없다.
        //powerOn 함수명이고 카멜표기법(소문자시작하는) 권장(단 클래스명X)
        //() 메소드를 호출할때 전달한 매개값을 받기 위한 곳
        //{} 메소드가 실행되는 구역
        //return 생략 void니까
        System.out.println("전원을 켭니다.");
    }
    void powerOff(){
            System.out.println("전원을 켭니다.");
        }
    int plus(int x , int y){
        //int 메소드가 호출한 곳으로 전달하는 결과 값의 타입이 int 뜻.
        //-
        //int x , int y : 메소드를 호출할때 전달한 매개값을 x와 y를 받았다.
        //-
        //void 제외한 함수내 return 무조건 1개 이상 필수
        int result = x + y;
        return result;
    }

    double divide(int x , int y){
        double result = (double) x / (double)y;
        return result; //리턴값 지정; 함수를 종료하는 키워드 vs break : 가장가까운 for/while/switch 종료
    }


} //ce
