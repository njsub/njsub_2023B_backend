package day10;

public class Car {

    //클래스멤버
    //필드
    int gas;


    //생성자 : 객체 생성시  new



    //메소드
        //필드값 변경하는 메소드 [매개변수 int / 리턴 x]
    void setGas( int gas){
        this.gas = gas;
    }//fe
        //필드 값에 따른 결과반환메소드[매개변수x / 리턴 boolean]
    boolean isLeftGas( ){
        if (this.gas==0){
            System.out.println("gas가 없습니다.");
            return false;
        }
            System.out.println("gas가 있습니다.");
            return true;
        }
        // 필드 값이 0 이면 무한루프가 종료되는 함수 [매개변수x / 리턴x]
        void run(){
        while (true){
            if(this.gas > 0){
                System.out.println("달립니다. gas 잔량" + this.gas);
                gas -= 1;
            }else{
                System.out.println("멈춥니다. gas 잔량 = " + this.gas);
                return;
            }//ife
        }//we
        }//fe

    }//ce
