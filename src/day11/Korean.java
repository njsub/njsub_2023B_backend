package day11;

public class Korean {

    //클래스 구성멤버
    //1필드

    final String nation = "대한민국";
    final String ssn;

    //2인스턴스 필드

    String name;

    //3상수필드 : 불변의 값
        //static final
        //1상수명은 관례적으로 대문자 2상수선언시 초기값 대입 3정적블록static{}초기값 대입
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_RADIUS_AREA;
        //정적블록[static멤버들의 초기값 대입]
    static {
        EARTH_RADIUS_AREA = 4* Math.PI * EARTH_RADIUS*EARTH_RADIUS;
    }


    //2생성자
    public Korean (String ssn , String name){
        this.ssn=ssn;
        this.name=name;
    }


    //메소드





}
