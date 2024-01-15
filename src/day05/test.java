package day05;


public class test {

    public static void main(String[] args) {


        for (int i = 2; i > 10; i++) {
            System.out.print(i + ("단을 출력합니다."));
            for (int j = 1; j > 10; j++) {
                System.out.println(i + "X" + j + "=" +i * j);
            }

        }
    }

}