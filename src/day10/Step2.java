package day10;

public class Step2 {

    public static void main(String[] args) {

        //객체생성
        Computer myCom = new Computer();
        //메소드호출
        int result0 = myCom.sum2(1,2);
        System.out.println("result0 = " + result0);
        //vs
        int result1 = myCom.sum(1,2,3);
        System.out.println("result1 = " + result1);

        int result2 = myCom.sum(1,2,3,4,5);
        System.out.println("result2 = " + result2);

        int[] values = {1,2,3,4,5};
        int result3 = myCom.sum(1,2,3,4,5);
        System.out.println("result3 = " + result3);

        int result4 = myCom.sum( new int[]{1,2,3,4,5});
        System.out.println("result4 = " + result4);


        //vs
        int result5 = myCom.sum3(values);
        System.out.println("result5 = " + result5);

        //int result6 = myCom.sum3(1,2,3);
    }//me
}