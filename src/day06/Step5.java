package day06;

import java.util.Scanner;

public class Step5 {

    public static void main(String[] args) { //ms

        Scanner scanner = new Scanner(System.in);
        System.out.println("시간(hhmmss형식) : ");
        String time = scanner.nextLine();

        System.out.println("시간(숫자) : ");
        String second = scanner.nextLine();

        String result = "";
        //입력받은 time에서 second 만큼 지난 시간을 hhmmss형식으로 출력

        int ss = Integer.parseInt(time.substring(4,6)); // 4~5까지 인덱스 문자추출
        ss += (Integer.parseInt(second));

        int mm = Integer.parseInt(time.substring(2,4)); // 2~3까지 인덱스 문자추출
        mm += (ss/60);

        int hh = Integer.parseInt(time.substring(0,2)); // 0~1까지 인덱스 문자추출
        hh += (hh/60);

        hh = hh > 24 ? hh -24 : hh;

        result = (hh <10 ? "0"+hh : hh)+":"+
                (mm%60 < 10 ? "0"+mm%60 : mm%60)+":"+
                (ss%60 < 10 ? "0"+ss%60 : ss%60);



        System.out.println("result = " + result);



        /*
            예)
                time = 145930
                second = 70
                    result = 15:00:
         */

    }//me

}//ce
