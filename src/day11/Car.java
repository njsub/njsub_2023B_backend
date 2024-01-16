package day11;

public class Car {

    // 클래스 구성 멤버
        // 필드 (public, private, default 정적static/ 인스턴스, final , 상수)
    private int speed;          //private 인스턴스 필드
    private boolean stop;       //private 인스턴스 필드

        // 생성자 (public, private, default)



        // 메소드 (public, private, default) (정적static/인스턴스)
        //외부로 부터 필드값으 필드 값에 대입해주는 메소드
    public int getSpeed(){ return  this.speed;}
        //2. 외부로부터 유효성 검사를 통한 필드 값 변경
    public void setSpeed(int speed){
        //매개 변수의 유효성검사를 통한 필드 값 변경
        if(speed<0){ // 만약에 매개변수 값이 0보다 작은면
            this.speed = 0;
        }else{
            this.speed=speed;
        }
    }

    //3. 외부로부터 필드값을 반환해주는 메소드
    public boolean isStop(){ return stop; }

    //4. 외부로부터 매개변수 값을 유효성 검사를 통해 필드값을 변경
    public void setStop(boolean stop){
        this.stop = stop;
        if( stop == true) this.speed = 0;
    }
} //c e
