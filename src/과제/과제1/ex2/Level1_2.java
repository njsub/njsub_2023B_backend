package 과제.과제1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */
		
		/* ----------- */
		boolean bool = true;
		byte b1 = 100;
		char ch1 = 'A';
		short sh1 = 30000;
		int i1 = 2000000000;
		long l1 = 40000000000L;
		float f1 = 3.1231232F;
		double d1 = 3.123123123;
		System.out.printf("%-10s   %15b   %30s\n" , "boolean" , bool , "true or false" );
		System.out.printf("%-10s   %15s   %30s\n" , "byte" , b1 , "-128 ~ 127" );
		System.out.printf("%-10s   %15s   %30s\n" , "char" , ch1 , "0~65535[ character1 ]" );
		System.out.printf("%-10s   %15s   %30s\n" , "short" , sh1 , "-32768 ~ 32767" );
		System.out.printf("%-10s   %15s   %30s\n" , "int" , i1 , "-+2000 million" );
		System.out.printf("%-10s   %15s   %30s\n" , "long" , l1 , "-+2000 million Excess" );
		System.out.printf("%-10s   %15.3f   %30s\n" , "float" , f1 , "8 decimal places" );
		System.out.printf("%-10s   %15.8f   %30s\n" , "double" , d1 , "17 decimal places" );



	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
