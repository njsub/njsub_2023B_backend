package day11;

public class Step2 {
    public static void main(String[] args) {



    //1객체생성
    Car myCar = new Car();

    //speed필드가 private 이므로 외부에서 접근 불가능
    //myCar.speed = -50;

    //메소드를 이용한 speed 필드에 접근
    myCar.setSpeed(-50);
    System.out.println("myCar = " + myCar.getSpeed());

    myCar.setSpeed(60);
    System.out.println("myCar = " + myCar.getSpeed());
    //만약에 car객체의 stop필드가 false이면
    if(!myCar.isStop()){
        myCar.setStop( true ); // 멈춤
    }
        System.out.println("myCar.getSpeed = " + myCar.getSpeed());


    }
}
