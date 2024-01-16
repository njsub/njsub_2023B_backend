package day11;

public class Singleton {
    //단 하나의 객체를 만드는 방법

    //1. 생성자를 외부로 부터 호출 불가능으로 만든다.
    private Singleton(){}

    //2. 필드에 미리 객체를 만든다.
    //2-1 Singleton singleton = new Singleton();
    //2-2 필드에 직접적인 막는다.
    //private Singleton singleton = new Singleton();
    //2-3 필드 정적 멤버(인스턴스 생성이 불가능 하기 때문에 정적으로 쓴다.)
    private static Singleton singleton = new Singleton();

    //3 필드 간접접근을 이용한 싱글톤 반환
    public static Singleton getSingleton(){
        return singleton;
    }


}
