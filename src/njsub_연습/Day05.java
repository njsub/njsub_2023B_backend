package njsub_연습;

public class Day05 {

    public static void main(String[] args) {
        
        
        String subject = "자바 프로그래밍";
        
        
        boolean result = subject.contains("");
        if (result){
            System.out.println("result = " + result);
        }else {
            System.out.println("result = " + result);
        }

        String board = "1번, 혼공자, 05.참조타입 챕터, 노진섭";
        String[] arr = board.split(",");

        System.out.println("번호 = " + arr[0]);
        System.out.println("책이름 = " + arr[1]);
        System.out.println("챕터 = " + arr[2]);
        System.out.println("성명 = " + arr[3]);

        System.out.println("arr.length = " + arr.length);
        System.out.println("board = " + board);
        
        for (int i = 0 ; i< arr.length; i++ ){
            System.out.println("arr[i] = " + arr[i]);
        }
        
        
    } //me

}
