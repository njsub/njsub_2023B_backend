package day10;

public class Step3 {

    public static void main(String[] args) {

        //p.237
        //객체생성
        Car myCar = new Car( );

        //필드에 5 저장
        myCar.gas = 5;

        //vs
        myCar.setGas(5);

        if(myCar.isLeftGas()){
            System.out.println("출발합니다.");
            myCar.run();
        } //ife
        System.out.println("gas를 주입하세요.");

    } //me
}//ce
