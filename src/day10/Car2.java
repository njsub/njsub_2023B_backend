package day10;

public class Car2 {
    int speed;
    static int speed2;

    void run(){ }
    static void simulate(){
        System.out.println( this.speed); // static 메소드에서 인스텅ㄴ스필드 호출 불가능
        System.out.println( speed2);// static 메소드에서 정적필드 호출 가능
        // this는 해당 메소드를 실행한 객체
        // static 객체없이 사용하는 메소드 이니까. 곧 this 가 없다.
    }


    void simulate2(){

        System.out.println(this.speed); //인스턴스 메소드에서 인스턴스필드 호출 가능
        System.out.println(speed2); //인서튼스 메소드에서 정적필드 호출 가능

    }

    public static void main(String[] args){ // main함수는 클래스없이 자바를 실행 하므로 정적메소드로 사용

        simulate(); // static 구여겡서 static 메소드 호출 가능
        simulate2(); // 오류 : static 구역에서 인스턴스 메소드 호출 불가능.
        // 해결책 : 객체 만들자.
        new Car2().simulate2(); // 가능
    }
}
