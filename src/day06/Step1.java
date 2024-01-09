package day06;

public class Step1 {
    public static void main(String[] args) {

        /*int[] intArray = null; // 스택영역에 변수생성 : intArray

        intArray[0] = 10; //.NullPointerException 스택은 있지만 힙은 없다라는 뜻

        String str = null;

        System.out.println("str.length() = " +str.length()); //.NullPointerException 스택은 있지만 힙은 없다라는 뜻

        //GC(가비지컬렉터) 자바는 힙영역을 직접 제거하는 방법을 제공하지 않는다.

        String hobby = " 여행 ";
            //String hobby 스택영역
            //" 여행 " : 힙영역 ex)102번지
            // = 대입 ex)102번지를 hobby변수에 대입

        hobby = null;
        // 여행 객체는 사용하지 않기 때문에 자동으로 제거됨

        String kind1 = "자동차";

        String kind2 = kind1;

        kind1 = null;
        // "자동차" 객체는 사리지지 않는다.

        System.out.println("kind2 = " + kind2);
*/
        String[] array1 = {"유재석", "강호동"};
        String[] array2 = new String[2];

        System.out.println("array2 = " +  array2);
        System.out.println("array2[1] = " +  array2[1]);
        array2[0] = "유재석"; //array야~ 유재석을 인덱스 0번에 넣어줘~
        //System.out.println(array2[0]); //호출시에는 꼭 인덱스를 넣어야 한다. 기억하자
        //System.out.println(array1[0] + "\t" + array1[1]);





    } //me

    // 함수종료되면 지역변수들이 사라지고 지역변수를 참조한 힘역역들도 함께 사라진다 . 뿅~
    // - main() 함수는 자바 진입 함수이니데 메인 함수가 끝나면 힙영역도 모두 사라진다. 뿅~



} //ce
