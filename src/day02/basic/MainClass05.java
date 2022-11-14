package day02.basic;
/*
[[기본 자료형]]

4. 실수형
 - 선언하는 방법
 	float 변수명;
 	double 변수명;
 	float(4byte) < double(8byte)
 	
 	
 오류 날 것을 미리 예측해서 처리하는 것 : 예외처리
 실수 계산 부동소수점오차 예외처리하기!
 */	

public class MainClass05 {
	public static void main(String[] args) {
		// 실수형 변수 선언과 동시에 값 대입하기
		float iFloat = 10.1f;
		double iDouble = 10.1d;
		double iDouble2 = 10.1; // double형 d는 생략가능
		
		System.out.println("float 형 : " + iFloat);
		System.out.println("iDouble 형 : " + iDouble);
		System.out.println("iDouble2 형 : " + iDouble2);
	}

}