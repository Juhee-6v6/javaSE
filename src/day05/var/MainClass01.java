package day05.var;

import day05.mypack.Card;

/*
[[ 변수 (variable) ]]

	변수란?
 	메모리 공간에 붙여진 이름.
 	JAVA 프로그램 사용되는 모든 값을 메모리 공간에 저장
 	메모리 공간에 이름을 붙여 접근 가능
 
 	변수 선언 및 조기화
 	자료형 변수영 = 값
 	
 1. 타입에 따른 변수
 		기본형 - 예약어 소문자로 시작, 값을 가지고 있다.
 			8가지 : boolean, byte, short, int, long, char, float, double
		참조형 - 대문자로 시작, 주소값을 가지고 있다.
			기본형 외 나머지 전부!
			ex) String
			
2. 선언 위치에 따른 변수			
		전역변수(global 변수)	- 클래스 안에 선언(멤버변수)
		지역변수(local 변수)	- 메소드 또는 생성자 안에 선언 
							중괄호 {} 안에 선언된 변수
							반드시 초기화 해줘야 한다! (안하면 컴파일 에러)
								
3. 정적(static) / 동적 변수


 ! 초기화 = 처음 값을 대입
	
*/	

public class MainClass01 {
	//public static String gVar;// new가 필요 없음. static이 대신함
	
	// ▼ 이 전체를 stack(스택) 영역 => 메인 메소드라고 생각해도 된다.
	public static void main(String[] args) {
		Card c1 = new Card();

		System.out.println(c1.cardType);
		System.out.println(c1.number);
		System.out.println(c1.width);
		System.out.println(c1.height);
		
		System.out.println();
		
		// 컨트롤 + c , 컨트롤 + 알트 c
		Card c2 = new Card();
		c2.cardType = "heart";
		c2.number = "K";
		c2.width = 65;
		c2.height = 90;
		System.out.println("c2.cardType	: " + c2.cardType);
		System.out.println("c2.number	: " + c2.number);
		System.out.println("c2.width	: " + c2.width);
		System.out.println("c2.height	: " + c2.height);
		
		System.out.println();
		
		System.out.println("c1.cardType	: " + c1.cardType);
		System.out.println("c1.number	: " + c1.number);
		System.out.println("c1.width	: " + c1.width);
		System.out.println("c1.width	: " + c1.height);
		
		
		
		/*
		 String lVar = "";
		 
		 System.out.println(gVar); //값이 없어서 null 뜸 
		 System.out.println(lVar); // 초기화가 없으면 컴파일 에러남
		 */
		
		//int num1 = 1;
		//int num2 = 2;
		
		
		// 이런 거는 Heap(힙)영역. 대부분 힙 영역임.
		/*
		 String str = "문자열";
		 
		 System.out.println(num1); 
		 System.out.println(num2);
		 */
		
		
	}

}
