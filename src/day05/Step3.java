package day05; // 패키지명

import java.util.Scanner;

public class Step3 { // cs

    public static void main(String[] args) { //ms

        // 입력객체
        Scanner scanner = new Scanner(System.in);


        //5-1 저장할 (배열)변수 선언
        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[] 비밀번호배열 = new int[3];


        //1. 무한루프
        while(true) { // w s // 2.무한루프

            // 1. 출력
            System.out.println("========== 방문록 ==========");
// 6 현재 변수 현황 출력
            System.out.printf("%2d \t %-5s \t %-20s \n" , 1 , 작성자배열[0] , 내용배열[0]);
            System.out.printf("%2d \t %-5s \t %-20s \n" , 2 , 작성자배열[1] , 내용배열[1]);
            System.out.printf("%2d \t %-5s \t %-20s \n" , 3 , 작성자배열[2] , 내용배열[2]);


            System.out.println(" 1.방문록 작성 2.방문록 삭제 3.종료 ");

            // 3. 입력
            System.out.println("선택>> "); int ch = scanner.nextInt();

            // 4. 입력된 경우의 수 판단
            if ( ch==1){
                //6-1 방문록 작성 할 위치(인덱스) 입력받는다.
                System.out.print("방문록 작성 위치 : 1. 2. 3. : ");  int no = scanner.nextInt();
                //6-2 입력 : 내용, 작성자, 비밀번호
                scanner.nextLine();
                System.out.print("내용 : ");      String content = scanner.nextLine();
                System.out.print("작성자 : ");    String writer = scanner.next();
                System.out.print("비밀번호 : ");  int password = scanner.nextInt();
                //6-3 저장
                내용배열 [no -1] = content ;
                작성자배열 [no -1] = writer ;
                비밀번호배열 [no -1] = password ;
            }
            else if (ch==2) {
                // 8-1 입력 : 삭제할 방문록의 위치 입력
                System.out.print("방문록 삭제 위치 : 1. 2. 3. : ");
                int no = scanner.nextInt();

                //8-2
                // 입력 : 유효성 검사를 위한 비밀번호 입력받기
                System.out.println("방문록 비밀번호 : ");
                int password = scanner.nextInt();

                //8-3 초기화:
                // 만약에 선택한 방문록의 패스워드와 입력한 패스워드와 같으면,
                if ((no >= 0 || no <= 내용배열.length) && 비밀번호배열[no - 1] == password) {
                    //배열의 항목/ 요소의 자리 /길이 삭제할 수 없으므로 초기값으로 대입.
                    내용배열[no - 1] = null;
                    작성자배열[no - 1] = null;
                    비밀번호배열[no - 1] = 0;
                } else {
                    System.out.println("경고 알수없는 위치입니다.");
                }
            }

            else if (ch==3) {break;}
            else {
                System.out.println("경고 : 알수없는 입력입니다.");
            }

        } //we
    }//me

}//ce
