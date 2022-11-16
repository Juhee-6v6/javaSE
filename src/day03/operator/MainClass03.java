package day03.operator;
/*
3.비교 연산자

>	: 크다
>=	: 크거나 같다
<	: 작다
<=	: 작거나 같다
==	: 같다
!=	: 다르다
*/

public class MainClass03 {
	public static void main(String[] args) {
		boolean result = 10 > 20;
		
		// 값을 비교해줌
		//System.out.println("10 > 20 : " + result);
		
		// 조건이 false라서 실행 안됨.
		if(result) {
			System.out.println("10은 20보다 작다.");
		}
		
		// true라서 실행
		if(10 == 10) {
			System.out.println("10과 10은 같다.");
		}
		if(10 != 20) {
			System.out.println("10과 20은 다르다.");
		}
		
		
		
	}

}















