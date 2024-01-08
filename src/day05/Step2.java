package day05; // 패키지명

public class Step2 {//클래스 시작

    public static void main(String[] args) {//메인 시작

        //p.165 : 배열(array)타입

        // 1. 배열 생성/ 선언 : 여러개 문자열을 저장하는 배열 선언
        String[] season = {"Spring", "Summer", "Fall", "Winter"}; // 타입 대괄호 변수명

        // 2. 배열의 각 요소 / 항목 의 값 호출
        System.out.println("season : " + season); //기본타입(7가지+String) 말고 참조타입 호출시 주소값이 나오는구나....
        System.out.println("season : " + season[0]); //배열 내 0번 인덱스의 값 호출
        System.out.println("season : " + season[1]);
        System.out.println("season : " + season[2]);
        System.out.println("season : " + season[3]);
        //System.out.println("season : " + season[4]); // 배열내 4번인덱스가 없으므로 호출 불가능
        System.out.println("season : " + season[3]);

        //2. for반복문을 이용한 호출
        for(int i = 0 ; i< season.length ; i++){ //f s
            System.out.println("season["+i+"] : " + season[i]);
        } // f e

        //3. 각 요소 / 항목의 값 수정
        season[1] = "여름";
        System.out.println("season[1]: " + season[1]);

        // - int형 83, 90, 87 3개 정수를 저장하는 배열 선언
        int [] scores = {83, 90, 87};
        // 2. 배열내 항목/요소 총합계
        int sum = 0;
        for (int i = 0 ; i<3 ; i++){ // f s
            sum += scores[i];

        } // f e
        System.out.println("sum = " + sum);
        double avg = (double) sum / 3;
        System.out.println("avg = " +avg);


        int[] arr1 = new int[3];
        for (int i = 0 ; i<3 ; i++){
            System.out.printf("arr1[%1d] : %2s" , i , arr1[i]);
        }
        arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
        for (int i = 0 ; i<3 ; i++) {
            System.out.printf("arr1[%1d] : %2s", i, arr1[i]);
        }
        System.out.println("\n");

        double[] arr2 = new double[3];
        System.out.println();
        for (int i = 0 ; i<3 ; i++) {
            System.out.printf("arr2[%1d] : %2d", i, arr2[i]);
        }

        System.out.println();

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        for (int i = 0 ; i<3 ; i++) {
            System.out.printf("arr2[%1d] : %2d", i, arr2[i]);
        }
        System.out.println("\n");

        String[] arr3 = new String[3];
        for (int i = 0 ; i<3 ; i++) {
            System.out.printf("arr3[%1d] : %2d", i, arr3[i]);
        }
        System.out.println();
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for (int i = 0 ; i<3 ; i++) {
            System.out.printf("arr3[%1d] : %2d", i, arr3[i]);
        }


    }//메인 끝
} //클래스 끝
