/*
 *  주석
 *   1) 자바실행
 *     A.java ========> A.class =========> 실행
 *         javac(기계어로 변환)        java(인터프리터)
 *                              ================
 *                                   JVM
 *   2) 자바에서 사용하는 데이터 표현법
 *     1. 정수
 *         = 10진법 : 100 , 200 . . .
 *         = 8진법 : 0(숫자)
 *         = 16진법 : 0x(숫자)
 *     2. 문자
 *         = 'A' , '홍', '0'
 *           'A' : 65  'A'+1 ==> 66
 *           'a' : 97
 *           '0' : 48
 *        ** 각 문자마다 고유 번호를 가지고 있는데 이를 ASCII코드라 한다.
 *     3. 문자열
 *         = "ABC", "홍길동"
 *     4. 실수
 *         = 10.5D (8byte), 10.5F(4byte)
 *         = 10.5 (8byte)
 *     5. 논리
 *         = true, false
 */
public class 자바기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수출력
		System.out.println(10);
		// 8진법
		System.out.println(011); // 8*1 + 1 = 9
		// 16진법
		System.out.println(0x55); // 16*5 + 5 = 85
		// 문자표현
		System.out.println('A');
		System.out.println('홍');
		// 문자열
		System.out.println("홍길동");
		// 실수
		System.out.println(10.5); //8byte
		System.out.println(10.5F); //4byte
		// 논리형 
		System.out.println(true);
		System.out.println(false);
		
		//문자열 결함 (+)
		System.out.println("7"+7+"7"+7+7); //77777
		System.out.println("7"+7+"7"+(7+7)); //777+14 = 77714
		System.out.println(7+7+7+"7"); //217
		
		// ASCII 코드 값
		System.out.println((int)'0'); //49
	}
}
