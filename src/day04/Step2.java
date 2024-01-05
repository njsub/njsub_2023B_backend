package day04; //패키지명

public class Step2 { //c s

    public static void main(String[] args) { // m s

        //p.124
        /*
        int sum = 0;
        for(int i=1; i<=100; i++){
            sum = sum + i;
        }
        System.out.println("1~100까지의 합:" + sum);

         */
        /*
        //p.126
        int sum = 0;
        int i;

        for(i=1; i<=100; i++){
            sum+=i;
        }
        System.out.println("1~"+(i-1) + "합: " + sum );

         */

        // 3. 구구단 : 중첩 for문:
        for (int m=2; m <=9; m++){ //for s
            System.out.println("***" +m + "단 ***");
            for(int n=1; n<=9; n++){
                System.out.println(m+"x"+n+"="+(m*n));
            }
        } //for e

        // 4. for -> while 1~10까지
        int j = 1;
        while( j<=10 ){
            System.out.println( j+ " ");
            j++;
        }

        // 5. for -> while 1~100까지 누적합계
        int sum2 = 0;
        int m = 1;
        while (m<=100){
            sum2 += m;
            m++;
        } // w end
        System.out.println("1~" +(m-1) + "합 :" + sum2);

    } // main e

} //class e
