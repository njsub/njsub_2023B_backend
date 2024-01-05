package 과제.과제1.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */

		/* ----------- */

		System.out.print("input boolean : " );
		boolean bool = scanner.nextBoolean();

		System.out.print("input byte : " );
		byte b1 = scanner.nextByte();

		System.out.print("input char : " );
		char ch1 = scanner.next().charAt(0);

		System.out.print("input short : " );
		short sh1  = scanner.nextShort();

		System.out.print("input int : " );
		int i1 = scanner.nextInt();

		System.out.print("input long : " );
		long l1 = scanner.nextLong();

		System.out.print("input float : " );
		float f1 = scanner.nextFloat();

		System.out.print("input double : " );
		double d1 = scanner.nextDouble();

		System.out.println("output boolean : " + bool);
		System.out.println("output byte : " + b1);
		System.out.println("output char : " + ch1);
		System.out.println("output short : " + sh1);
		System.out.println("output int : " + i1);
		System.out.println("output long : " + l1);
		System.out.println("output float : " + f1);
		System.out.println("output double : " + d1);





	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. print() 메소드 사용
		3. scanner 객체 사용하여 입력받기
*/
